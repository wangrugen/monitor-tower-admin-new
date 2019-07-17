package com.iotplatform.device.controller;

import com.google.gson.Gson;
import com.hazelcast.internal.json.JsonObject;
import com.iotplatform.common.ResponseMessage;
import com.iotplatform.device.dao.DeviceEntityMapper;
import com.iotplatform.device.entity.DeviceEntity;
import com.iotplatform.device.entity.DeviceEntityExample;
import com.iotplatform.device.param.DeviceParam;
import com.iotplatform.receiveHexDecimal.dao.PositionRecordEntityMapper;
import com.iotplatform.receiveHexDecimal.entity.PositionRecordEntity;
import com.iotplatform.receiveHexDecimal.entity.PositionRecordEntityExample;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/device")
public class DiviceController {


    @Autowired
    private DeviceEntityMapper  deviceEntityMapper;

    @Autowired
    private PositionRecordEntityMapper  positionRecordEntityMapper;


    @RequestMapping(value ="/deviceList")
    @ResponseBody
    public ResponseMessage deviceList(DeviceParam vo ){
        vo.setPage((vo.getPage()-1)*vo.getLimit());
        List<Object > obj =deviceEntityMapper.list(vo ,vo.toRowBounds());
        DeviceEntityExample example  =new  DeviceEntityExample();
        return new ResponseMessage(deviceEntityMapper.countByExample(example),obj);
    }

    @RequestMapping(value ="/toWidthDeviceTime")
    public ModelAndView toAddDevice(DeviceParam vo ){
        ModelAndView mv = new ModelAndView();
        mv.addObject("imie",vo.getImie());
        mv.setViewName("widthDeviceTime");
        return mv;
    }

    @RequestMapping(value ="/toWidthDeviceTimeMapTraceParam")
    @ResponseBody
    public Map toWidthDeviceTimeMapTraceParam(DeviceParam vo){
        Map  map =new HashMap();
        map.put("imie",vo.getImie());
        map.put("startTime",vo.getStartTime());
        map.put("endTime",vo.getEndTime());
        return map;
    }

    @RequestMapping(value ="/toWidthDeviceTimeMapTracePage")
    public ModelAndView toWidthDeviceTimeMapTracePage(DeviceParam vo){
        //查询设备当日的所有轨迹
        PositionRecordEntityExample  recordEntityExample  =new PositionRecordEntityExample();
        try {

            recordEntityExample.or().andCreateTimeBetween( DateUtils.parseDate(vo.getStartTime(),"yyyy-MM-dd HH:mm:ss"), DateUtils.parseDate(vo.getEndTime(),"yyyy-MM-dd HH:mm:ss")).andImeiEqualTo(vo.getImie());
            recordEntityExample.setOrderByClause("CREATE_TIME");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        List<PositionRecordEntity>  list =positionRecordEntityMapper.selectByExample(recordEntityExample);
        ModelAndView mv = new ModelAndView();
        if(CollectionUtils.isNotEmpty(list)) {
            mv.addObject("traces", toTraceString(list));
            double d[] = new double[2];
            d[0] = Double.valueOf(list.get(0).getJingDu());
            d[1] = Double.valueOf(list.get(0).getWeiDu());
            Gson  gson  =new Gson();
            mv.addObject("center", gson.toJson(d));
        }
        mv.setViewName("mapTracePage");
        return mv;
    }

    @RequestMapping(value ="/addDevice")
    @ResponseBody
    public ResponseMessage addDevice(DeviceParam vo){
        DeviceEntity deviceEntity  =new DeviceEntity();
        deviceEntity.setDeviceImei(vo.getImie());
        deviceEntity.setCreateTime(new Date());
        deviceEntity.setDeviceName(vo.getName());
        deviceEntityMapper.insert(deviceEntity);
        return new ResponseMessage(0,null);
    }

    public static  String toTraceString(List<PositionRecordEntity>  list){
        Double  d  []=null;
        List<Double []>  list1  =new ArrayList<>();
        for (PositionRecordEntity entity :list){
            d=new Double[2];
            d[0]=Double.valueOf(entity.getJingDu());
            d[1]=Double.valueOf(entity.getWeiDu());
            list1.add(d);
        }
         Gson  gson  =new Gson();
        return gson.toJson(list1 );
    }

    public static  void main (String args[]){
        double []  d =new double[2];
        d[0]=111.2;
        d[1]=111.3;
        double [][] d1=new double[1][2];
        d1[0][1]=d[0];
        List<double[]> list =new ArrayList<>();
        list.add(d);
        Map<String ,String >  hashMap=new HashMap<>();
        hashMap.put("AAA","BBB");
        Gson  gson =new Gson() ;
        System.out.print(gson.toJson(list));

    }
}

package com.iotplatform.device.controller;

import com.iotplatform.common.ResponseMessage;
import com.iotplatform.device.dao.DeviceEntityMapper;
import com.iotplatform.device.entity.DeviceEntityExample;
import com.iotplatform.picValidation.entity.PicValidationEntityExample;
import com.iotplatform.picValidation.param.PicTesParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/device")
public class DiviceController {


    @Autowired
    private DeviceEntityMapper  deviceEntityMapper;


    @RequestMapping(value ="/deviceList")
    @ResponseBody
    public ResponseMessage getPicTestList(PicTesParam vo ){
        vo.setPage((vo.getPage()-1)*vo.getLimit());
        List<Object > obj =deviceEntityMapper.list(vo ,vo.toRowBounds());
        DeviceEntityExample example  =new  DeviceEntityExample();
        return new ResponseMessage(deviceEntityMapper.countByExample(example),obj);
    }

}

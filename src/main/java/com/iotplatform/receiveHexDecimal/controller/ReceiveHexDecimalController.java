package com.iotplatform.receiveHexDecimal.controller;

import com.iotplatform.common.ResponseMessage;
import com.iotplatform.picValidation.dao.PicValidationEntityMapper;
import com.iotplatform.picValidation.param.PicTesParam;
import com.iotplatform.picValidation.service.PicValidationService;
import com.iotplatform.receiveHexDecimal.dao.PositionRecordEntityMapper;
import com.iotplatform.receiveHexDecimal.dao.ReceiveHexDecimalEntityMapper;
import com.iotplatform.receiveHexDecimal.entity.PositionRecordEntityExample;
import com.iotplatform.receiveHexDecimal.entity.ReceiveHexDecimalEntityExample;
import com.iotplatform.receiveHexDecimal.param.ReceiveHexDecimalParam;
import com.iotplatform.receiveHexDecimal.service.ReceiveHexDecimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/receiver")
public class ReceiveHexDecimalController {

    @Autowired
    private PositionRecordEntityMapper positionRecordEntityMapper ;

    @Autowired
    private ReceiveHexDecimalService receiveHexDecimalService;

    @RequestMapping(value ="/receiveHexDecimalList")
    @ResponseBody
    public ResponseMessage receiveHexDecimalList(ReceiveHexDecimalParam vo ){
        vo.setPage((vo.getPage()-1)*vo.getLimit());
        List<Object > obj =positionRecordEntityMapper.list(vo ,vo.toRowBounds());
        PositionRecordEntityExample  example  =new  PositionRecordEntityExample();
        return new ResponseMessage(positionRecordEntityMapper.countByExample(example),obj);
    }


    @RequestMapping(value ="/startServerReceiveHexDecimal")
    @ResponseBody
    public ResponseMessage startServerReceiveHexDecimal(int port , HttpServletRequest  request){
        try{
            receiveHexDecimalService.startUpReciverHexServer(port);
        }catch (Exception e){

        }finally {
            return new ResponseMessage();
        }

    }


    @RequestMapping(value ="/startServerReceiveHexDecimalTool")
    @ResponseBody
    public ResponseMessage startServerReceiveHexDecimalTool(int port , HttpServletRequest  request){
        try{
            receiveHexDecimalService.startUpReciverHexServerTool(port);
        }catch (Exception e){

        }finally {
            return new ResponseMessage();
        }

    }


}

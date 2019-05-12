package com.iotplatform.receiveHexDecimal.controller;

import com.iotplatform.common.ResponseMessage;
import com.iotplatform.picValidation.dao.PicValidationEntityMapper;
import com.iotplatform.picValidation.param.PicTesParam;
import com.iotplatform.picValidation.service.PicValidationService;
import com.iotplatform.receiveHexDecimal.dao.ReceiveHexDecimalEntityMapper;
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
    private ReceiveHexDecimalEntityMapper   receiveHexDecimalEntityMapper ;

    @Autowired
    private ReceiveHexDecimalService receiveHexDecimalService;

    @RequestMapping(value ="/receiveHexDecimalList")
    @ResponseBody
    public ResponseMessage receiveHexDecimalList(ReceiveHexDecimalParam vo ){
        vo.setPage(vo.getPage()-1);
        List<Object > obj =receiveHexDecimalEntityMapper.list(vo ,vo.toRowBounds());
        return new ResponseMessage(obj.size(),obj);
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




}

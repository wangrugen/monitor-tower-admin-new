package com.iotplatform.picValidation.controller;

import com.iotplatform.common.ResponseMessage;
import com.iotplatform.picValidation.dao.PicValidationEntityMapper;
import com.iotplatform.picValidation.param.PicTesParam;
import com.iotplatform.picValidation.service.PicValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/pic")
public class PicController {

    @Autowired
    private PicValidationEntityMapper  picValidationEntityMapper;

    @Autowired
    private PicValidationService picValidationService;

    @RequestMapping(value ="/testPicList")
    @ResponseBody
    public ResponseMessage getPicTestList(PicTesParam vo ){
        vo.setPage(vo.getPage()-1);
        List<Object > obj =picValidationEntityMapper.list(vo ,vo.toRowBounds());
        return new ResponseMessage(obj.size(),obj);
    }


    @RequestMapping(value ="/startUpServer")
    @ResponseBody
    public ResponseMessage getPicTestList(int port , String url  , HttpServletRequest  request){
        try{
            String strDirPath =request.getSession().getServletContext().getRealPath("/")+url+System.getProperty("file.separator");
            picValidationService.startUpReciverServer(port,strDirPath,url);
        }catch (Exception e){

        }finally {
            return new ResponseMessage();
        }

    }




}

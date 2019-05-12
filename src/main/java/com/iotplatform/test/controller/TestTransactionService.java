package com.iotplatform.test.controller;

import com.iotplatform.picValidation.dao.PicValidationEntityMapper;
import com.iotplatform.picValidation.entity.PicValidationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class TestTransactionService {


    @Autowired
    private PicValidationEntityMapper  picValidationEntityMapper ;

    @Autowired
    private   TestTransactionService  testTransactionService;

    @Transactional
    public  void TestTransaction1 (){
        PicValidationEntity entity  =new PicValidationEntity();
        entity.setId(6);
        entity.setCreateTime(new Date());
        picValidationEntityMapper.updateByPrimaryKeySelective(entity);
        System.out.print("更新成功");

    }

    @Transactional
    public void TestTransaction2 (){
        //privateTest();

        //picValidationEntityMapper.selectByPrimaryKey(6);
        //picValidationEntityMapper.selectByPrimaryKey(6);

        picValidationEntityMapper.selectForUpdate();
        System.out.println();
    }


    private void updateEntity(){
        PicValidationEntity entity  =new PicValidationEntity();
        entity.setId(6);
        entity.setCreateTime(new Date());
        picValidationEntityMapper.updateByPrimaryKeySelective(entity);
        System.out.print("更新成功");

    }
    private void  privateTest(){

        updateEntity();
    }


     public   void  testInterface(){

         PicValidationEntity entity  =new PicValidationEntity();
         entity.setId(6);
         entity.setCreateTime(new Date());
         picValidationEntityMapper.updateByPrimaryKeySelective(entity);
         System.out.print("更新成功");

     }





}

package com.iotplatform.test.controller;


import com.iotplatform.AppApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AppApplication.class)
public class TestJunit {

    @Autowired
    private TestTransactionService  testTransactionService;

    @Test
    public  void testTransaction1 (){
        testTransactionService.TestTransaction2();
        System.out.println("---------------------可以啊-----------------");

    }

}

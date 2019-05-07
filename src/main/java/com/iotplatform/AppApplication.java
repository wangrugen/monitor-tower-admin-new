package com.iotplatform;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.iotplatform"})
@MapperScan(basePackages = "com.iotplatform.**.dao")
public class AppApplication extends SpringBootServletInitializer {
     public static  void main (String args []){
         SpringApplication.run(AppApplication.class);
     }
}

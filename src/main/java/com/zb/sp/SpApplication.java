package com.zb.sp;

import com.zb.sp.controller.UserController;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(value = "com.zb.sp.dao")
public class SpApplication {
    static SpApplication sp = new SpApplication();
    public static void main(String[] args) {
        SpringApplication.run(SpApplication.class, args);
        UserController us = new UserController();
        us.getPort();
    }

}

package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *@ClassName EurekaMain7002
 *@Description  TODO
 *@Author hqb
 *@Date 2022/2/13 13:02
 *@Version 1.0
 */

@SpringBootApplication
@EnableEurekaServer   //该注解用于向使用consul或者
public class EurekaMain7002{

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}


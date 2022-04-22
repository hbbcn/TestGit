package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *@ClassName PaymentMain8001
 *@Description  TODO
 *@Author hqb
 *@Date 2022/1/23 21:29
 *@Version 1.0
 */


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMain8001{

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}

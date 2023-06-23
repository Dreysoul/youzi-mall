package com.youzi;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(value = "com.youzi.mapper")//扫描mybatis的mapper接口，注册为bean
@EnableSwagger2Doc
@EnableDiscoveryClient //启用服务发现功能
public class AdvertisementServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(AdvertisementServiceApp.class,args);
    }
}

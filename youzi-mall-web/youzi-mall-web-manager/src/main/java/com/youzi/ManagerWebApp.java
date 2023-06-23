package com.youzi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//应用程序入口类
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //禁用SpringBoot的数据源自动配置 不使用数据库或者手动配置数据源
//@EnableAspectJAutoProxy //启用AspectJ自动代理
@EnableFeignClients
public class ManagerWebApp {

    public static void main(String[] args) {

        SpringApplication.run(ManagerWebApp.class, args);
    }
}

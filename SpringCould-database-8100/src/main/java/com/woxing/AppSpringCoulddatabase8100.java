package com.woxing;

import com.netflix.discovery.shared.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableDiscoveryClient   //和@EnableEurekaClient 一样  更通用
@MapperScan("com.woxing")
public class AppSpringCoulddatabase8100
{
    public static void main( String[] args ){
        SpringApplication.run(AppSpringCoulddatabase8100.class,args);
    }
}

package com.woxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient   //和@EnableEurekaClient 一样  更通用
public class  SpringCouldredis8200
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringCouldredis8200.class,args);
    }
}

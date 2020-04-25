package com.woxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCoulduser8300
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringCoulduser8300.class,args);
    }
}

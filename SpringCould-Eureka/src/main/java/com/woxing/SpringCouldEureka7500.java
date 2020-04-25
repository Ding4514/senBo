package com.woxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCouldEureka7500
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringCouldEureka7500.class,args);
    }
}

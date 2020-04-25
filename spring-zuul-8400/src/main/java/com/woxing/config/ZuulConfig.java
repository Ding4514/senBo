package com.woxing.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@Configuration
public class ZuulConfig {

    /*
    *   *是 全部 允许
    * */
    @Bean
    public CorsFilter corsFilter(){
        final UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration configuration = new CorsConfiguration();

        configuration.setAllowCredentials(true);  //支持 cookie 跨域
        configuration.setAllowedOrigins(Arrays.asList("*")); //原始域
        configuration.setAllowedHeaders(Arrays.asList("*")); //头跨域
        configuration.setAllowedMethods(Arrays.asList("*")); //方法跨域
        configuration.setMaxAge(300l); //：300秒内的相同的跨域请求就不会进行坚持

        configurationSource.registerCorsConfiguration("/**",configuration);

        return new CorsFilter(configurationSource);

    }

}

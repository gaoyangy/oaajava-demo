package com.oaajava.demo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication(exclude = { FeignAutoConfiguration.class })
@EnableDubbo
@MapperScan( basePackages = {"com.oaajava.demo.dao"})
public class OaajavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaajavaApplication.class, args);
    }

}

package com.andy.springbootcasclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.andy.springbootcasclient.mapper")
@SpringBootApplication
public class SpringbootcasclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootcasclientApplication.class, args);
    }

}

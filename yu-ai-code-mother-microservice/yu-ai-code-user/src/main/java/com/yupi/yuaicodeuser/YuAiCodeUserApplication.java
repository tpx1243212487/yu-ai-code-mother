package com.yupi.yuaicodeuser;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.yupi.yuaicodeuser.mapper")
@ComponentScan("com.yupi")
@EnableDubbo
//@EnableDubbo
public class YuAiCodeUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(YuAiCodeUserApplication.class, args);
    }
}

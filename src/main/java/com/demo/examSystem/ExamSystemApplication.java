package com.demo.examSystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@MapperScan("com.demo.examSystem.dao")
@EnableRedisRepositories
@EnableCaching
public class ExamSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamSystemApplication.class, args);
    }

}

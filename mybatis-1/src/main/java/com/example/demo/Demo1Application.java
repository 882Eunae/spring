package com.example.demo;

import org.mybatis.logging.LoggerFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.**.mapper")
public class Demo1Application {
   private static final org.mybatis.logging.Logger log = LoggerFactory.getLogger(Demo1Application.class);
   public static void main(String[] args) {
       SpringApplication.run(Demo1Application.class, args);
   }
}
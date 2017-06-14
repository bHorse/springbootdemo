package com.example.spring_mybatis_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.spring_mybatis_demo.dao")
public class SpringMybatisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMybatisDemoApplication.class, args);
	}
}

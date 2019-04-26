package com.I.LoveU;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan("com.I.LoveU.mapper")

public class LoveUApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoveUApplication.class, args);
	}

}

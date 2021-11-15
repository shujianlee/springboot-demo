package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ServletComponentScan
@EnableScheduling
public class Demo3Application {

	public static void main(String[] args) {
		System.out.println("main 主干启动");
		System.out.println("启动！");
		SpringApplication.run(Demo3Application.class, args);
	}

}

package com.sun5.moon5;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@MapperScan("com.sun5.moon5.mapper")
public class Moon5Application {

	public static void main(String[] args) {
		SpringApplication.run(Moon5Application.class, args);
	}

}

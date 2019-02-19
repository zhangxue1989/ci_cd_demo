package com.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CiCdDemoApplication extends SpringBootServletInitializer{

	/**
	 * @title jar包运行
	 * @param args
	 * @author: xue.zhang
	 * @date 2019年2月1日下午1:41:55
	 */
	public static void main(String[] args) {
		SpringApplication.run(CiCdDemoApplication.class, args);
	}
	/**
	 * war包运行
	 */
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CiCdDemoApplication.class);
    }

}

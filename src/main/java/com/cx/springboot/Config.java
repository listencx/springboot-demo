package com.cx.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
	

	@Bean
	public CorsFilter getCros(){
		CorsFilter f = new CorsFilter();
		return f;
	}
}

package com.cx.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author chenxin
 *
 */
@SpringBootApplication
@EnableAsync
@EnableCaching
public class App {  
    
  public static void main(String[] args) {  
	  new SpringApplicationBuilder(App.class).web(true).run(args);
  }  
}  
package com.srpingboottest.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class GittestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GittestApplication.class, args);
	}

	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
}

package com.nareshit.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldImpl {

	@RequestMapping(value="/")
	public String getHelloWorld() {
		return "Welcome To Spring Boot Through STS <===> SPRING TOOL SUITE";
	}

}

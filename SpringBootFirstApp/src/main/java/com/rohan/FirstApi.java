package com.rohan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApi {
	@RequestMapping("/hello")
	public String hello() {
		return "hello from Spring boot";

	}
}
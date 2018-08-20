package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaController {
	@RequestMapping("/greeting")
	public String hello () {
		int a = 1;
		int c = 1;
		int sum = 0;
		for(int i=0;i<=10;i++) {
			sum += i;
		}
		return sum + "Hello world";
	}
}

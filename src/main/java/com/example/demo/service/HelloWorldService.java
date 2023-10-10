package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
	public String getTestString(String displayString) {
		return "King of The World";
	}
}

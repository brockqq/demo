package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.demo.service.HelloWorldService;

class HelloWorldControllerTest {

	@Test
	void test() {
		HelloWorldService service =Mockito.mock(HelloWorldService.class);
		Mockito.when(service.getTestString(Mockito.anyString())).thenReturn("123");
		String check = service.getTestString("123");
		assertEquals("123", check);		
		service.中文方法();
	}
//問題 場景
}

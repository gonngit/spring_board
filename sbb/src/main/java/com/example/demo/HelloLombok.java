package com.example.demo;

import lombok.Getter;
//import lombok.Setter;
import lombok.RequiredArgsConstructor;


@Getter
//@Setter
@RequiredArgsConstructor
public class HelloLombok {
	private final String hello;
	private final int lombok;
	
	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok("Hello, Lombok!", 5);
		//helloLombok.setHello("Hello, Lombok!");
		//helloLombok.setLombok(5);
		System.out.println(helloLombok.getHello());
		System.out.println(helloLombok.getLombok());
	}

}

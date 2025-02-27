package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // this means that this class is a Controller
public class HelloController {
	@GetMapping("/hello") // call this method hello when the URL /hello is requested
	@ResponseBody
	public String hello() {
		return "Hello, sbbbfdfdfdb!";
	}
	
}

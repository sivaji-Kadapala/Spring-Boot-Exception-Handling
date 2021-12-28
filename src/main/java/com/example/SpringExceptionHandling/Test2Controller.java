package com.example.SpringExceptionHandling;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {
	@GetMapping("test2/reg")
	// http://localhost:8080/test2/reg?age=10
	public String getAge(@RequestParam Integer age) {
		System.out.println("From age begin");
		if (age < 0) {
			throw new AgeInvalidException("Age should be greater than 0");

		}
		System.out.println("from getAge end");
		return "age is:" + age;
	}

}

package com.example.mysite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DemoApplication {

	@RequestMapping("/")
	public String index() {
		return "Hello";
	}

	@RequestMapping("/{num}")
	public String index(@PathVariable int num, Model model) {
		int res = num;
		model.addAttribute("msg", "num : " + res);
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

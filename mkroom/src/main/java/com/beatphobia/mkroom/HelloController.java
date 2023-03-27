package com.beatphobia.mkroom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public void helloPage() {
		System.out.println("hello");
	}
}

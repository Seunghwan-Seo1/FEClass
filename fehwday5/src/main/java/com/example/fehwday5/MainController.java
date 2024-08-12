package com.example.fehwday5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@GetMapping("/") 
	public String index() {
		return "index";
	}
  

	@GetMapping("/detail") 
	public String detail() {
		return "detail";  
	}
	@GetMapping("/shop") 
	public String shop() {
		return "shop"; 
	}
	
	@GetMapping("/notice") 
	public String getnotice() {
		return "notice"; 
	}
	@PostMapping("/notice")
	public String postnotice(@RequestParam ("title") String title,
						@RequestParam ("contents") String contents 
			) {
		System.out.println("입력하신 제목은" + title);
		System.out.println("입력하신 내용은" + contents);
		return "index";
	}
}
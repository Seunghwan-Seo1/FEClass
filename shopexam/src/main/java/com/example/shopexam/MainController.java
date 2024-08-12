package com.example.shopexam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@GetMapping("/") //주소창에 /main이라고 들어 오면
	public String index() {
		return "index";  //main.html을 호출한다.
	}
  

	@GetMapping("/productdetails") 
	public String productdetails() {
		return "productdetails";  
	}
	@GetMapping("/products") 
	public String products() {
		return "products"; 
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
package com.example.mallexam;

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
	@GetMapping("/main") //주소창에 /main이라고 들어 오면
	public String main() {
		return "main";  //main.html을 호출한다.
	}
	@GetMapping("/login")
	public String getlogin() {
		return "login";
	}
	
	@PostMapping("/login")
	public String postlogin(@RequestParam String email,
							@RequestParam String password 
			) {
		System.out.println(email);
		System.out.println(password);
		return "login";
	}
	
	@GetMapping("/products")
	public String products() {
		return "products";
	}
	@GetMapping("/wishlist")
	public String wishlist() {
		return "wishlist";
	}
	@GetMapping("/shoppinglist")
	public String shoppinglist() {
		return "shoppinglist";
	}
	@GetMapping("/favoriteshop")
	public String favoriteshop() {
		return "favoriteshop";
	}
	@GetMapping("/becomeseller")
	public String becomeseller() {
		return "becomeseller";
	}
	@GetMapping("/productdetails")
	public String productdetails() {
		return "productdetails";
	}
	
	@GetMapping("/create")
	public String getcreate() {
		return "create";
	}
	
	@PostMapping("/create")
	public String postcreate(@RequestParam ("title") String title,
						@RequestParam ("contents") String contents 
			) {
		System.out.println("입력하신 제목은" + title);
		System.out.println("입력하신 내용은" + contents);
		return "index";
	}
	

}

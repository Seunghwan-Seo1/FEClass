package com.example.finalexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;






@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("members", memberService.readlist());
		return "index"; 
	}
	
	@GetMapping("/create")
	public String create() {
		return "create";
	}
	
	
	@PostMapping("/create")
	public String create(@ModelAttribute Member member) {
		
		memberService.create(member);

		return "redirect:/"	;
	}
	
	
}

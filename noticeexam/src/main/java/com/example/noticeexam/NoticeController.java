package com.example.noticeexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;






@Controller
public class NoticeController {
	@Autowired
	private NoticeService noticeService;

	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("notices", noticeService.readlist());
		return "index"; 
	}
	
	@GetMapping("/create")
	public String create() {
		return "create";
	}
	
	
	@PostMapping("/create")
	public String create(@ModelAttribute Notice notice) {
		
		noticeService.create(notice);

		return "redirect:/"	;
	}
	
	
}

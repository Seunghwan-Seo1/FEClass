package com.example.finalexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;






@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;


	
	@GetMapping("/board")
	public String Board(Model model) {
		model.addAttribute("boards", boardService.readlist());

		return "board";
	}
	
	
	@PostMapping("/board")
	public String Board(@ModelAttribute Board board) {
		
		boardService.create(board);

		return "redirect:/"	;
	}
	
	
	
	
}


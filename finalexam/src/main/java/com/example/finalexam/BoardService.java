package com.example.finalexam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired // 객체(빈) 생성
	private BoardRepository boardRepository;
	
	public void create(Board board) { //컨트롤러에서 데이터를 받아서 객체에 데이터를 던져줌
		boardRepository.save(board);
	}
	
	public List<Board> readlist() {
		return boardRepository.findAll();
	}
}
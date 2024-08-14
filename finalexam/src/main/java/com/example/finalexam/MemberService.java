package com.example.finalexam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired // 객체(빈) 생성
	private MemberRepository memberRepository;
	
	public void create(Member member) { //컨트롤러에서 데이터를 받아서 객체에 데이터를 던져줌
		memberRepository.save(member);
	}
	
	public List<Member> readlist() {
		return memberRepository.findAll();
	}
}

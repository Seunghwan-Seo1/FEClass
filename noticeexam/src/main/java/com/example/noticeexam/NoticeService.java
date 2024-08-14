package com.example.noticeexam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {
	
	@Autowired 
	private NoticeRepository noticeRepository;
	
	public void create(Notice notice) { 
		noticeRepository.save(notice);
	}
	
	public List<Notice> readlist() {
		return noticeRepository.findAll();
	}
}

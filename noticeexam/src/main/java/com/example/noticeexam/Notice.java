package com.example.noticeexam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Notice {
		@Id//기본키
		public String title;
		
		public String content;

	
}

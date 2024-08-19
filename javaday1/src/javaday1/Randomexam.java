package javaday1;

import java.util.Random;

public class Randomexam {
	public static void main(String [] args) {
		
		//랜덤(난수) 기능을 가져오자.
		
		Random rand = new Random();
		
		int n1 = rand.nextInt(9);
		
		System.out.println("한 자리 양의 정수 0~9 : " + n1);
		
		int n2 = 1 + rand.nextInt(8);
		
		System.out.println("한 자리 양의 정수 0은 제외 : "+ n2);
		
		int n3 = 10 + rand.nextInt(89);
		System.out.println("두 자리 양의 정수 10~99 :  " + n3);
	}
	

}

package javaday1;

import java.util.Scanner;

public class Q7 {
	public static void main(String [] args) {
		
		System.out.println("삼각형의 넓이를 구합니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 : ");
		double x = sc.nextDouble();
		
		System.out.print("높이 : ");
		double y = sc.nextDouble();
		
		
		System.out.println("넓이는 " + ((x*y)/2) + "입니다." );
		
		sc.close();
		
	}
}
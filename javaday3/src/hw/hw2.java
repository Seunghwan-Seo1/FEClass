package hw;

import java.util.Scanner;

public class hw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		int x = sc.nextInt();
		
		if (x>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}

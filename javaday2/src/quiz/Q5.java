package quiz;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int x = sc.nextInt();
		
		if (x < 60) {
			System.out.println("가");
		} else if(x<70) {
			System.out.println("양");
		} else if (x<80) {
			System.out.println("미");
		} else if (x<90) {
			System.out.println("우");
		} else if (x<=100) {
			System.out.println("수");
		} else{
			System.out.println("잘못된 점수입니다..");
		}
		
		sc.close();

	}
}

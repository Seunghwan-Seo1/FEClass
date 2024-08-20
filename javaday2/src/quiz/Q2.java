package quiz;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int x = sc.nextInt();
		
		System.out.print("정숫값 : ");
		int y = sc.nextInt();
		
		int result = y % x ;
		
		if (result == 0) { 
			System.out.println(y +"은(는)" + x + "의 약수이다.");
		} else {
			System.out.println(y +"은(는)"+ x + "의 약수가 아니다.");
		}
		
		sc.close();
	}
}

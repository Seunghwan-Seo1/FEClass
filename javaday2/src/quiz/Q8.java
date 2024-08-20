package quiz;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이를 입력하세요 : ");
		int x = sc.nextInt();
		
		String age = (x>=18) ? "성인입니다." : "미성년자입니다.";
		
		System.out.println(age);
		
		sc.close();
	}
}

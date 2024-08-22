package hw;

import java.util.Scanner;

public class hw5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이를 입력해주세요 : ");
		int age = sc.nextInt();
		
		String result = (age >=18) ? "성인입니다." : "미성년자입니다.";
		
		System.out.println(result);
	}
}

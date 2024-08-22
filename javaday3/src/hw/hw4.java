package hw;

import java.util.Scanner;

public class hw4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		String result = (a>0) ? "양수입니다." : (a<0 ? "음수입니다." : "0입니다.");
		
		System.out.println(result);
	}
}

package hw;

import java.util.Scanner;

public class Hw6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String result = (num>0) ? "양수입니다" : (num<0 ? "음수입니다." : "0");
		System.out.println(result);
	}
}

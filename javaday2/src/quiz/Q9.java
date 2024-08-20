package quiz;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 A : ");
		int x = sc.nextInt();
		
		System.out.print("정수 B : ");
		int y = sc.nextInt();
		
		String result = (x>y) ? "A가 더 큽니다." : "B가 더 큽니다.";

		System.out.println(result);
		sc.close();
		
	}
}

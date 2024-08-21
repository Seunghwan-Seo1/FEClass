package quiz;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 A : ");
		int x = sc.nextInt();
		
		System.out.print("정수 B : ");
		int y = sc.nextInt();
		
		
		System.out.println("a>=b가 되도록 정렬 했습니다.");
		
		if (y>=x) {
			int t = x;
			x = y;
			y = t;
		}
		
		System.out.println("변수 a는 " + x + "입니다." );
		System.out.println("변수 b는 " + y + "입니다." );
		sc.close();

	}
}

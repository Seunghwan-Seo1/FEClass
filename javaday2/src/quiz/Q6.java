package quiz;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 A : ");
		int x = sc.nextInt();
		
		System.out.print("정수 B : ");
		int y = sc.nextInt();
		
		int result; //전역 변수 선언을 해줘야 전체적으로 영향을 미친다.
				
		if (x>y) {
			result = x-y;

		} else {
			result = y-x;
		}
		
		System.out.println("두 값의 차는 " + result + "입니다.");
		sc.close();
		
	}

}

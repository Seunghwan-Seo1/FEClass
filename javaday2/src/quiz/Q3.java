package quiz;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int x = sc.nextInt();
		
		if (x <0) {
			System.out.println("이 값은 음의 값입니다.");
		} 	else if(x>0) {
			System.out.println("이 값은 양수입니다.");
		} else {
			System.out.println("이 값은 0입니다.");
		}
		
		sc.close();

	}
}

package quiz;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변수 A : ");
		int x = sc.nextInt();
		
		System.out.print("변수 B : ");
		int y = sc.nextInt();
		
		if (x < y) {
			System.out.println("B가 크다.");
		} 	else if (x > y) {
			System.out.println("A가 크다.");
		} else { 
			System.out.println("A와 B가 같다.");
		}
		sc.close();

	}
}

package hw;

import java.util.Scanner;

public class hw3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변수 A : ");
		int a = sc.nextInt();
		System.out.print("변수 B : ");
		int b = sc.nextInt();
		System.out.print("변수 C : ");
		int c = sc.nextInt();
		
		if (a>b && a>c) {
			System.out.println("변수 중 가장 큰 수는 " + a +"입니다.");
		} else if(b>a && b>c) {
			System.out.println("변수 중 가장 큰 수는 " + b + "입니다.");
		} else {
			System.out.println("변수 중 가장 큰 수는 " + c + "입니다.");
		}
	}
}

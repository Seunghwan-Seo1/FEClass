package javaday1;

import java.util.Scanner;

public class Q6 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x값 : ");
		double x = sc.nextDouble();
		
		System.out.print("y값 : ");
		double y = sc.nextDouble();
		
		
		System.out.println("합계는 " + (x+y) + "입니다." );
		System.out.println("평균은 "+ ((x+y)/2)+"입니다." );
		
		sc.close();
		
	}
}
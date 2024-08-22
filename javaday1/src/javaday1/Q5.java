package javaday1;

import java.util.Scanner;

public class Q5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정숫값 : ");
		
		int x = sc.nextInt();
		
		
		
		System.out.println("10을 더한 값은 "+ (x+10)+"입니다." );
		System.out.println("10을 뺀 값은 "+ (x-10)+"입니다." );
		
		sc.close();
		
	}
}

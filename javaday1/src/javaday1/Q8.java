package javaday1;

import java.util.Random;
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int x = sc.nextInt();
		
		Random rand = new Random();
		
		int y = rand.nextInt(11) -5 ;
		System.out.println("입력 값의 +-5 범위의 난수를 생성했습니다. " );
		System.out.println("값은 " + (x+y) + "입니다." );
		
		sc.close();

	}
}

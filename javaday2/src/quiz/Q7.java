package quiz;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 A : ");
		int x = sc.nextInt();
		
		System.out.print("정수 B : ");
		int y = sc.nextInt();
		
		System.out.print("정수 C : ");
		int z = sc.nextInt();
			
		int min = x;
		
		if (y < min) {
			min = y;
		} 
		
		if (z < min) {
			min = z;
		} 
		
		System.out.println("최솟값은 " + min + "입니다.");
		sc.close();
		
	}
}

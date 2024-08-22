package hw;

import java.util.Scanner;

public class hw2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int x = sc.nextInt();
        
        System.out.print("두 번째 정수를 입력하세요 : ");
        int y = sc.nextInt();
        
        System.out.println("두 정수의 합은 " + (x + y) +"입니다." );
        
        sc.close();
	}
}

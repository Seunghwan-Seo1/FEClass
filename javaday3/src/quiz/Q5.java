package quiz;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99 사이의 숫자를 맞추세요.");
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		int n = rand.nextInt(90) +10;
		int a = rand.nextInt();
		
		while (n != a) {
			System.out.print("어떤 숫자일까? :");
			a = sc.nextInt();
			
			String result = (n>a) ? 
					"더 큰 숫자입니다." : (n<a ? "더 작은 숫자입니다." : "정답입니다.");
			System.out.println(result);
			
		}
		sc.close();
	}
}

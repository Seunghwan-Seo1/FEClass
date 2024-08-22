package quiz;

import java.util.Random;
import java.util.Scanner;

public class Q13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("숫자 맞추기 게임 시작!\n0부터 99사이의 숫자를 맞추세요.\n");
        
        Random rand = new Random();
		int k = rand.nextInt(100) ;
        
        for (int i = 0; i<6; i++) {
        	System.out.print("남은 횟수 "+(6-i)+"회, 어떤 숫자일까? :");
        	int guess = sc.nextInt();
        	
        	if (guess < k) {
        		System.out.println("더 큰 숫자입니다.");
        	} else if (guess>k) {
        		System.out.println("더 작은 숫자입니다.");
        	} else if (guess == k) {
        		System.out.println((i+1)+"회만에 맞추었습니다.");
        		break;
        	}
        }
	}
}

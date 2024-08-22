package hw;

import java.util.Scanner;

public class hw1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름은 무엇인가요? : ");
        String x = sc.next();
        
        System.out.print("당신의 나이는 어떻게 되나요? : ");
        int y = sc.nextInt();
        
        System.out.println("안녕하세요 " + x + "님. 당신은 " + y +"살 이군요." );
        
        sc.close();
	}
}

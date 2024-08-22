package quiz;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("정방형을 표시합니다." + "\n" + "단수는 : ");
        int n = sc.nextInt();
        
        for (int i = 1; i<=n; i++) {
        	for (int j=1; j<=n; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        sc.close();
	}
}

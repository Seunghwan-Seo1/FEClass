package quiz;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 *을 표시할까요? : ");
        int n = sc.nextInt();
		
        for (int i=1; i<=n; i++) {
        	System.out.print("*");
            System.out.print((i % 5 == 0) ? "\n" : "");
        }
        sc.close();
	}
}
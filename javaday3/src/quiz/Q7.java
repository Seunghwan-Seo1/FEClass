package quiz;

import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1부터 n까지의 합을 구합니다. n의 값 : ");
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i<=n; i++ ) {
        	result += i;
        }
    	System.out.println("1부터 "+n+"까지의 합은 " +result+"입니다.");
    	sc.close();
	}
}

package quiz;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("정수를 더합니다.\n몇개를 더할까요? : ");
        int n = sc.nextInt();
        int sum = 0;
        int i;
        for (i = 0; i<n; i++) {
        	System.out.print("정수(0으로 종료):");
        	int j = sc.nextInt();
        	sum += j;
        	if (j==0) {
        		break;
        		}
        	}
        System.out.println("합계는 "+ sum + "입니다.");
    	System.out.println("평균은" +(sum/i) + "입니다.");
    	sc.close();
	}
}

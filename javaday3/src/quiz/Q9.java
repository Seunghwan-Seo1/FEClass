package quiz;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("정숫값 : ");
        int n = sc.nextInt();
		int count = 0;
        for (int i=1; i<=n; i++) {
        	if (n%i == 0) {
        		System.out.print(i + " ");
        		count++;
        	}
        }
        System.out.println("\n" + n + "의 약수는 "+ count + "개 입니다.");
        sc.close();
	}
}

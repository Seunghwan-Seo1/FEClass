package quiz;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 A : ");
        int a = sc.nextInt();
        
        System.out.print("정수 B : ");
        int b = sc.nextInt();
        
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        
        while (a <= b) {
            System.out.print(a + " ");
            a++;
        }
        
        sc.close();
    }
}

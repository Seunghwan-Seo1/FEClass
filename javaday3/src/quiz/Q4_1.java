package quiz;

import java.util.Scanner;

public class Q4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;

        do {
            System.out.print("정숫값 : ");
            int a = sc.nextInt();

            String result = (a > 0) ? 
                    "이 값은 양수입니다." : (a == 0 ? "이 값은 0 입니다." : "이 값은 음수입니다.");
            System.out.println(result);

            System.out.print("다시 한번? 1-Yes/0-No : ");
            b = sc.nextInt();
                        
        } while (b == 1);

        sc.close();
    }
}

package quiz;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정숫값 : ");
        int x = sc.nextInt();
        
        String result = (x > 0) 
            ? "이 값은 양수입니다." : (x == 0 ? "0입니다." : "이 값은 음수입니다."); 
        
        System.out.println(result);
        sc.close();
    }
}

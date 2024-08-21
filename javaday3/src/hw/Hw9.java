package hw;

import java.util.Scanner;

public class Hw9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요일을 숫자로 입력하세요. : ");
		int day = sc.nextInt();
		
		String dayString = "";
		switch (day) {
		case 1 : dayString = "월";
				break;
		case 2 : dayString = "화";
				break;
		case 3 : dayString = "수";
				break;
		case 4 : dayString = "목";
				break;
		case 5 : dayString = "금";
				break;
		case 6 : dayString = "토";
				break;
		case 7 : dayString = "일";
				break;
		
			
		default : dayString = "잘못 입력하셨습니다.";
		break;
		}
		System.out.println(dayString);
	}
}

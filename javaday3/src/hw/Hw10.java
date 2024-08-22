package hw;

import java.util.Scanner;

public class Hw10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과일 품목에 붙어있는 번호를 입력하세요. : ");
		int fruit = sc.nextInt();
		
		String fruitString = "";
		switch (fruit) {
		case 1 : fruitString = "사과";
				break;
		case 2 : fruitString = "바나나";
				break;
		case 3 : fruitString = "오렌지";
				break;
		case 4 : fruitString = "귤";
				break;
		case 5 : fruitString = "감";
				break;
		case 6 : fruitString = "멜론";
				break;
		case 7 : fruitString = "수박";
				break;
		
			
		default : fruitString = "잘못 입력하셨습니다.";
		break;
		}
		System.out.println(fruitString);
	}
}

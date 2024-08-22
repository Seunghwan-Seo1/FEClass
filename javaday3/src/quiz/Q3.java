package quiz;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 월입니까? : ");
		int month = sc.nextInt();
		
		String monthString = "";
		
		switch (month) {
		case 1 : case 2 : case 12 : monthString = "겨울"; 	break;
		case 3 : case 4 : case 5 : 	monthString = "봄";		break;
		case 6 : case 7 : case 8 : 	monthString = "여름";		break;
		case 9 : case 10 : case 11 :monthString = "가울";		break;
		default : monthString = "그런 월은 없습니다.";
		break;
		}
		System.out.println(monthString);
		sc.close();
	}
}

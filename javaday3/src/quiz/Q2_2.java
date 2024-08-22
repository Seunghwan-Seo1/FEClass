package quiz;

import java.util.Random;

public class Q2_2 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int n = rand.nextInt(3);
		
		String rsp = "";
		
		switch (n) {
		case 0 : rsp = "가위";
		break;
		case 1 : rsp = "바위";
		break;
		case 2 : rsp = "보";
		break;
		}
		System.out.println("컴퓨터가 낸 것 : " + rsp);
	}
}

package quiz;

import java.util.Random;

public class Q2_1 {
	public static void main(String [] args) {
		
		
		Random rand = new Random();
		
		int n = rand.nextInt(3);
		
		String result = (n==1) ? 
				"컴퓨터가 낸 것 : 바위" : (n==0 ? "컴퓨터가 낸 것 : 가위" : "컴퓨터가 낸 것 : 보");
		System.out.println(result);
	}
}

package am;

import java.util.ArrayList;
import java.util.Arrays;

public class FInalexam {
	public static void main(String[] args) {
		
		int a= 5;
		System.out.println(a);
		
		a= 6;
		System.out.println(a);
		
		final int b= 5;
		System.out.println(b);
		
		//b=6; b변수에는 final이 붙어 있으므로, 다시 선언 할 수 없다.
		
		final ArrayList<String> a1 = new ArrayList<>(Arrays.asList("a","b"));
		
		//a1 = new ArrayList<>(Arrays.asList("c","d")); a1 리스트에 final이 붙어있으므로 수정 불가능
	}
}

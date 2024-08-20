package am;

import java.util.Arrays;
import java.util.HashSet;

public class Setexam {
	public static void main(String[] args) {
		
		//제네릭을 사용하여 집합 구성
		HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
		
		
		/*집합은 중복을 허용하지 않고, 순서가 없어 
		e,h,l,o가 순서를 무시하고 출력된 모습*/
		System.out.println(set);
	}
}

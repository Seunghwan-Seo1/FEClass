package am;

import java.util.Arrays;
import java.util.HashSet;

public class Unionexam {
	public static void main(String[] args) {
		
		HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
		HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
		
		HashSet<Integer> union = new HashSet<>(s1);
		//s1으로 유니온 생성
		
		
		union.addAll(s2);
		//합집합 수행
		
		System.out.println(union);
		// [1,2,3,4,5,6,7,8,9] 츌력
	}
}

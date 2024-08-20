package am;

import java.util.ArrayList;

public class Genericsexam {
	public static void main (String [] args) {
		
		// 제네릭스를 안 쓸 경우 코드가 복잡해진다.
		// 배열 생성
		ArrayList pitches = new ArrayList();
		
		//배열에 데이터 넣기 , 기본적으로 자료형이 object로 들어간다.
		pitches.add("138");
		pitches.add("129");
		
		
		//배열에 데이터 넣기
		String one = (String) pitches.get(0);
		String two = (String) pitches.get(1);
		
		//제네릭 선언 시 코드가 간단해진다.
		
		ArrayList<String> pitches2 = new ArrayList();
		
		pitches2.add("138");
		pitches2.add("129");
		
		String one2 = pitches2.get(0);
		String two2 = pitches2.get(1);
		
	}
}

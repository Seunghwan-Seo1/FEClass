package am;

import java.util.HashMap;

public class Hashmapexam {
	public static void main(String[] args) {
		
		// 맵 객체 생성
		HashMap<String,String> map = new HashMap<>();
		
		//객체에 데이터 넣기
		map.put("people", "사람");
		map.put("baseball","야구");
		
		
		//객체에 넣은 데이터 추출하기
		System.out.println(map.get("people"));
		System.out.println(map.get("baseball"));
	}
}

package javaday1;

public class Boolexam {
	
	public static void main (String[] args) {
		
		System.out.println(2>1);
		System.out.println(1==2);
		System.out.println(3%2 == 1);
		System.out.println("3".equals("2"));
		
		int base = 180;
		int height = 185;
		boolean isTall = height > base;
		
		if (isTall) {
			System.out.println("키가 큽니다.");
		}
		
		int i =3;
		boolean isOdd = i%2 ==1;
		System.out.println(isOdd);
	}

}

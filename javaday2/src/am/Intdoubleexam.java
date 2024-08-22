package am;

public class Intdoubleexam {
	public static void main(String[] args) {
		
		int n1 = 123;
		double d1 = n1;
		System.out.println(d1);
		//정수를 실수로 바꿀때에는 캐스팅이 필요 없다.
		
		
		double d2 = 123.456;
		int n2 = (int) d2; //명시적 형 변환
		//실수를 정수형으로 바꿀때에는 반드시 정수형으로 캐스팅 해줘야한다.
		System.out.println(n2);
	}
}

package pm;

public class Ifexam {
	public static void main(String[] args) {
		int money = 2000;
		boolean hasCard = true;
		
		if (money >= 3000 || hasCard) { // and 나 or 연산자를 이용해 조건 설정을 더 풍부하게 할 수 있다.
			System.out.println("택시를 타고 가라"); //true일 경우 실행
		} else {
			System.out.println("걸어가라"); //false일 경우 실행
		}
	}
}

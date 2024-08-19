package javaday1;

public class Sample2 {
	public static void main (String[] args) {
		System.out.println(7%3); //1 출력
		System.out.println(3%7); //3 출력
		
		
		/* % 나머지 연산자는 3가지로 중요하게 사용된다.
		 * 1. 홀수인지 여부
		 * 2. 짝수인지 여부
		 * 3. 배수인지 여부
		 */
		
		System.out.println(4%2); 
		//어떤수를 2로 나누었을때, 나머지가 0이면 항상 짝수
		System.out.println(5%2); 
		//어떤수를 2로 나누었을때, 나머지가 1이면 항상 홀수
		
		System.out.println(6%3);
		//어떤수를 특정숫자로 나누었을때 나머지가 0이면 항상 그 수의 배수
		
		
	}

	
}

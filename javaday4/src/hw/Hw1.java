package hw;

public class Hw1 {
	public static void main(String[] args) {
		 int[] array = {10, 20, 30, 40, 50};
		 
		 int max = array[0];
		 int index = 0;
		 
		 for (int j = 0; j<array.length; j++) {
			 if (array[j]>max) {
				 max = array[j];
				 index = j;
			 }
		 for (int i = 0; i < array.length/2; i++) {
			 int a = array[i];
			 array[i] = array[array.length - 1 - i];
			 array[array.length - 1 - i] = a;
			 }
		 
		 }
		 for (int num : array) {
	            System.out.print(num + " "); //배열 바꾼 후 출력
	     }
		 System.out.println();
		 System.out.println(max); //배열에서 가장 큰 정수 출력
		 System.out.println(index);//배열에서 가장 큰 값의 인덱스 출력
	}
}

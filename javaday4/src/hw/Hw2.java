package hw;

public class Hw2 {
	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < array.length/2; i++) {
			 int a = array[i];
			 array[i] = array[array.length - 1 - i];
			 array[array.length - 1 - i] = a;
			 }
		for (int num : array) {
            System.out.print(num + " "); //배열 바꾼 후 출력
		}
	}

}

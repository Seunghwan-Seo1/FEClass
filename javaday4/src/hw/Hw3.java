package hw;

public class Hw3 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        boolean find = false;
        
        for (int i = 0; i< array.length; i++) {
        	if (array[i]==target) {
        		find = true;
        	}
        }
        System.out.println(find);
	}
}

package pm;

import java.util.ArrayList;
import java.util.Arrays;

public class Foreachexam {
	public static void main(String[] args) {
		ArrayList<String> numbers = new ArrayList<> (Arrays.asList("one","two","three"));
		for (String number : numbers) {
			System.out.println(number);
		}
		
		String[] numbers1 = {"one","two","three"};
		for (String number1 : numbers1) {
			System.out.println(number1);
		}
	}
}

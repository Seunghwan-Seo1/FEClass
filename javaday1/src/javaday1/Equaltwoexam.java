package javaday1;

public class Equaltwoexam {
	public static void main(String [] args) {
		String a = "hello";
		String b = new String("hello");
		System.out.println(a.equals(b));  // true
		System.out.println(a == b);  // false
	}
}

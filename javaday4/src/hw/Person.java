package hw;

public class Person {
	String name;
	int age;
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("Hello, my name is " +name+ " and i'm " +age + "years old");
	}
}

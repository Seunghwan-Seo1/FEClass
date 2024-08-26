package am;


class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	Dog () {
		//디폴트 생성자
	}
	void sleep () {
		System.out.println(this.name = " zzz");
	}
}

class HouseDog extends Dog {
	
	HouseDog(String name) {
		this.setName(name);
	}
	
	HouseDog(int type) {
		if (type==1) {
			this.setName("yorkshire");
		} else if (type == 2) {
			this.setName("bulldog");
		}
	}
	
	@Override
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	void sleep (int hour) {
		System.out.println(this.name + " zzz in house for " + hour + "hours");
	}
}
public class Constructorexam {
	
	public static void main(String[] args) {
		
		
	}
}

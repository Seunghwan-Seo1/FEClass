package pm;

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
	//부모 클래스 Animal의 모든게 보이지는 않지만 이미 왔었다.
    void sleep() {
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {
	// Dog의 모든 기능과 Animal의 모든 기능을 전부 사용한다.
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }
}

public class Sample {
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("Happy"); //Animal 클래스의 기능
        houseDog.sleep();  // happy zzz in house 출력
    }
}

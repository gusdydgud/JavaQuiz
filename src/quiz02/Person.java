package quiz02;

public class Person {
	String name;
	int age;
	int tall;
	
	void info() {
		System.out.println(name);
		System.out.println(age+"세");
		System.out.println("키:"+tall);
	}
	Person(String pName,int pAge, int pTall){
		name = pName;
		age = pAge;
		tall = pTall;
		
	}

	Person(){
		name ="홍길동";
		age = 40;
		tall = 200;
		
	}
}

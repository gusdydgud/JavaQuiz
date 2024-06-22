package quiz07;


public class MainClass {

	public static void main(String[] args) {
		
//		Child c = new Child("홍길동","홍순자");
//		System.out.println(c.info());
//		Student s = new Student("홍길동",20,"123123");
//		System.out.println(s.info());
		SuperSonicAp a = new SuperSonicAp("보잉707");
		a.takeOff();
		a.flymode = 1;
		a.fly();
		a.land();
		

	}

}

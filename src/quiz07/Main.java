package quiz07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperSonicAp a = new SuperSonicAp("보잉707");
		a.takeOff();
		a.flymode = 1;
		a.speed =1000;
		a.fly();
		a.land();
		System.out.println(a.info());

	}

}

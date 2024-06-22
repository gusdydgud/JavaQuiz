package quiz13;

public class MainClass {
	public static void main(String[] args) {
		
		Unit m = new Marine(10,20,60);
		Unit t = new Tank(0,10,100);
		Unit d = new DropShip(2,10,60);
		
		m.change(10, 5);
		m.location();
		m.spec();
		Unit m2 = new Marine(10,10,60);
		m2.spec();
		m.move(1, 1);
		m.location();
		t.location();
		d.location();
		t.changeMode();
		
	}

}

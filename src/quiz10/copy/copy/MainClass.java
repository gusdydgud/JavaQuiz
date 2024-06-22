package quiz10.copy.copy;

public class MainClass {
public static void main(String[] args) {
	
	MyCart m = new MyCart(2000);
	m.buy(new Tv());
	m.buy(new Radio());
	m.buy(new Computer());
	m.buy(new Computer());
	m.buy(new Computer());
	
	m.info();
	
}
}

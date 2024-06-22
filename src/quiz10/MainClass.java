package quiz10;

public class MainClass {
public static void main(String[] args) {
	
	MyCart m = new MyCart(10000);
	m.buy(new Tv());
	m.buy(new Radio());
	m.buy(new Computer());
	
	m.myCartInfo();
	
}
}

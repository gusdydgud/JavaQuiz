package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		com.computerInfo();
		
		Monitor monitor = com.getMonitor();
		monitor.info();

		
	}
}

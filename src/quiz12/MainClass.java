package quiz12;

public class MainClass {
	public static void main(String[] args) {
		 Shape c = new Circle("Circle",3);
		 Shape r = new Rect("Rect",4);
		 System.out.println("c의 넓이:"+c.getArea());
		 System.out.println("r의 넓이:"+r.getArea());
	}

}

package quiz12;

public class Rect extends Shape{
	public Rect(String name,int side) {
		super(name);
		this.side = side;
		// TODO Auto-generated constructor stub
	}

	//사각형은 생성될 때 도형이름과, 변의 길이를 받고 초기화합니다.
	//getArea()는 사각형의 넓이를 계산하도록 오버라이딩 처리
	//main에서 객체를 생성해서 확인하세요
	private int side;

	@Override
	public double getArea() {
		int sum = side*side;
		// TODO Auto-generated method stub
		return sum;
	}

	
}

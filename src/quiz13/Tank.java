package quiz13;

public class Tank extends Unit{

	public Tank(int x, int y, int hp) {
		super(x, y, hp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("현재탱크 위치:"+x + y);
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("현재 위치에 정지");
		
	}
	public void changeMode() {
		System.out.println("공격모드 변경");
	}

}

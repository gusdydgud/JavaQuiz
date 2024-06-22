package quiz13;

public class Marine extends Unit{

	public Marine(int x, int y, int hp) {
		super(x, y, hp);
	
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("현재 마린위치:"+x +" "+ y);
		
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


	@Override
	protected void changeMode() {
		// TODO Auto-generated method stub
		
	}
	

}

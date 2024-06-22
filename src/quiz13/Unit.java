package quiz13;

public abstract class Unit {
	
	int x;
	int y;
	int hp;
	static int attack=6;
	static int armor=0;
	
	public Unit(int x,int y, int hp) {
		this.hp = hp;
		this.x = x;
		this.y = y;
	}
	public abstract void location();
	public abstract void move(int x,int y);
	public abstract void stop();
	public void change(int a,int b) {
		attack+=a;
		armor+=b;
	}
	public void spec() {
		System.out.println("공:"+attack+" 방:"+armor);
	}
	protected abstract void changeMode();
	

}

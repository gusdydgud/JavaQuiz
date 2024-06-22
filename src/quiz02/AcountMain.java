package quiz02;

public class AcountMain {

	public static void main(String[] args) {
		
		Account myAcc = new Account("홍길동","1234",3600);
		myAcc.deposit(800);
		myAcc.withDarw(1900);
		
		int bal = myAcc.getBalance();
		System.out.println(myAcc.name+"님의 계좌 잔액은: "+bal+"원입니다.");
		
		// TODO Auto-generated method stub

	}

}

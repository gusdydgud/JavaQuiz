package quiz02;

public class Account {
	
	String name;
	String pass;
	int balance;
	
	void deposit(int a) {
		balance +=a;
		
	}
	void withDarw(int a) {
		balance -=a;
	}
	int getBalance() {
		
		return balance; //클래스 외부에서 값을 가져갈 수 있음
	}
	Account(String pName,String pPass,int a){
		name = pName;
		pass = pPass;
		balance = a;
	}
	Account(){
		
	}

}

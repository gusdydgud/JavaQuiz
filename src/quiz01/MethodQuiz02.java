package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		System.out.println(java(5));
		System.out.println(sum(8));
		System.out.println(primeNum(-3,2));
		
		/*
		 * 1. java()
		 * -매개변수로 정수를 받아
		 * -매개변수 1 -> return "자";
		 * -매개변수 2 -> return "자바";
		 * -매개변수 3 -> return "자바자";
		 * -매개변수 4 -> return "자바자바";
		 * 2. sum()
		 * 매개변수로 정수를 1개 받습니다.
		 * 매개변수의 약수의 합계를 리턴
		 * 매개변수 5-> return 1+5
		 * 매개변서 6-> return 1+2+3+6
		 * 3. primeNum()
		 * 매개변수 2개를 받아서, 순서 상관없이, 두 수 사이의 합계를 리턴
		 * 1,2=> return1+2;
		 * 2,1=> return1+2;
		 * 1,1=> return0;
		 *  
		 */
		// TODO Auto-generated method stub

	}
	static String java(int a) {
		String str = "";
		for(int i=1;i<=a;i++) {
		if(i%2==1) {
			str+="자";
		}else {
			str+="바";
		}}
		return str;
	}
	static int sum(int a) {
		int sum =0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	static int primeNum(int a,int b) {
		int sum=0;
		if(a>b) {
			for(int i = b ;i<=a;i++) {
				sum+=i;
				
			}
		}else if(a<b) {
			for(int i =a;i<=b;i++) {
				sum+=i;
				
			}
		
//		}else if(a>b&&a<0) {
//			for(int i =b;i<a;i++) {
//				sum+=i;
			}else {
				sum=0;
			}
		
		return sum;
	}
	
}

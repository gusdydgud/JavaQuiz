package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		System.out.println(method3(1,2,3 ));
		System.out.println(method4(5));
		method05(3,"재밌네");
		System.out.println(maxNum(10,9));
		System.out.println(abs(-200));
		
		// TODO Auto-generated method stub

	}
	static double method3(int a, int b,double c) {
		return a+b+c;
	}
	static String method4(int a) {
		String s="";
		if(a%2==0) {
			s="짝수";
		}
		else if(a%2!=0) {
			s="홀수";
		}
		return s;
	}
	static void method05(int a,String c) {
		String str="";
		for(int i =1; i<=a;i++) {
			str+=c;
		}
		System.out.println(str);
	}
	static int maxNum(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	static int abs(int a) {
		if(a<0) {
			return -a;
		}else {
			return a;
		}
	}

}

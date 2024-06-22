package quiz15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. main에서는 scanner를 사용해서 2개의 정수값을 입력받음
		 * 2. divide(정수 2개) 를 입력받는 메서드에 전달을 해줌
		 *   -> 
		 * 3. divide메서드에서는 b=0으로 나눈경우 예외를 강제생성해서 종료하는 구문을 작성해
		 * 4.main에서 입력받을 때는, 문자인경우 예외처리를 진행하고, 다시입력
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
		try {
			System.out.print("정수 2개 입력>");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(divide(a,b));
			
		}catch(InputMismatchException e){
			System.out.println("숫자만써라");
			sc.nextLine();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("0으로 나눠? 이새끼 수알못이네 ㅅㄱ");
			break;
		}
		
		
		
	}
}
	
	public static int divide(int a ,int b) throws Exception {
		int re =0 ;
		if(b==0) {
			throw new Exception();
		}
		re = a/b;
		return re;
	}
	
	
	

}

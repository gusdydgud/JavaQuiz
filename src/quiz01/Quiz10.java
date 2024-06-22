package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		//명인교육의 계산기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String y = sc.next();
		int b = sc.nextInt();
		switch (y) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		case "/":
			System.out.println(a/b);
			break;
 
	
			
		default:
			System.out.println("잘못입력");
			break;
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}

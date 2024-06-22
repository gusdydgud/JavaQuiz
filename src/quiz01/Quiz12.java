package quiz01;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int n = sc.nextInt();
		int c = 1;
		System.out.println("구구단 : "+n+"단");
		
		while(c<10) {
			System.out.println(n+" x "+c+" = "+(n*c));
			c++;
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}

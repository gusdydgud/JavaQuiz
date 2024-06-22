package quiz01;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i%2==0 && i>0) {
			System.out.println("짝수");
		}
		else if(i%2!=0 && i>0) {
			System.out.println("홀수");
		}
		else if(i==0) {
			System.out.println("제로");
		}
		else {
			System.out.println("음수");
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}

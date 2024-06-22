package quiz01;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		String n = sc.next();
		String str = "";
		int b=1;
		while(b<=a) {
			
			str+=n;
			System.out.print(n);
			b++;
		}
		System.out.println(str);
		sc.close();
		// TODO Auto-generated method stub

	}

}

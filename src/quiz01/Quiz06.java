package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double k = 0;
		int a = 0;
		k = sc.nextDouble();
		a = sc.nextInt();
		if(k>=140 && a>=8) {
			System.out.println("탑승가능");
			
		}
		else {
			System.out.println("탑승불가능");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}

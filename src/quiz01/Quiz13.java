package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int count = 1;
		int bae =0;
		while(count<=i) {
			if(count%4==0) {
				bae++;
			}
			if(count%8==0) {
				bae--;
			}
			count++;
		}
		System.out.println(bae);
		sc.close();
		/*
		while(count!=i) {
			if(i%4==0 || i%8==0 && i!=0) {
				bae++;
			}
			
			count++;
			
		}*/
		
//		System.out.println(bae);
		// TODO Auto-generated method stub

	}

}

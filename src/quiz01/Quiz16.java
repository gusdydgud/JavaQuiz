package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int b = 1;
		int cnt =0;
		while(b<=i) {
			if(i%b==0) {
				cnt+=b;
			}
			b++;
		}
		sc.close();
		
		System.out.println(cnt);
		// TODO Auto-generated method stub

	}

}

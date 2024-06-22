package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum =0;
		if(a>b) {
			while(a>=b) {
				sum+=b;
				b++;
			}
		}else if(a<b) {
			while(a<=b) {
				sum+=a;
				a++;
			}
		}
		
		System.out.println(sum);
		sc.close();
		
		// TODO Auto-generated method stub

	}

}

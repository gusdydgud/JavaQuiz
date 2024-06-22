package quiz01;

import java.util.Scanner;

public class Quiz21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int cnt=0;
		int sum=0;
		/*
		for(int i = 1; i<=a;i++) {
			for(int j =1;j<=i;j++) {
				if(j%i==0) {
					sum=sum+i-1;
				}
			}
		}System.out.println(sum);
	
		for(int i = 1; i<=a;i++) {
			for(int j=i;j<=a;j++) {
				if(j%i==0 && i!=1) {
					sum+=j;
				}
			}
			
		}System.out.println(sum);
		
		
		for(int i =1 ;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(j%i==0) {
					cnt++;
					if(cnt==2) {
						
						sum+=i;
					}
				}
		}//System.out.println(sum);
		}cnt =0;
		System.out.println(sum);
	*/
		start:for(int i =1;i<=a;i++) {
			cnt=0;
			for(int j = 1;j<=i;j++) {
				if(i%j==0) {
					cnt++;
				}
				if(cnt>2) {
					continue start;
				}
			}
			if(cnt==2) {
				sum+=i;
		}
		}System.out.println(sum);
	sc.close();
	}
	
}

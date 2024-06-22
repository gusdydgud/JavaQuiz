package quiz01;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int tem;
		/*
		if(a>b) {
			if(b>c) {
				System.out.println(a+" "+b+" "+c);
			}else if(b<c) {
				if(a>c) {
					System.out.println(a+" "+c+" "+b);
				}else {
					System.out.println(c+" "+a+" "+b);
				}
			}
			}else if(b>a) {
				if(a>c) {
					System.out.println(b+" "+a+" "+c);
				}else if(a<c) {
					if(b>c) {
						System.out.println(b+" "+c+" "+a);
					}else {
						System.out.println(c+" "+b+" "+a);
					}
				}
			}
			else if(c>a) {
				if(a>b) {
					System.out.println(c+" "+a+" "+b);
				}else if(a<b) {
					if(c>b) {
						System.out.println(c+" "+b+" "+a);
					}else {
						System.out.println(b+" "+c+" "+a);
					}
				}
			}
			sc.close();*/
		if(a<b) {
			tem = a;
			a = b;
			b = tem;
		}
		if(b<c) {
			tem = c;
			c = b;
			b = tem;
		}
		if(a<b) {
			tem = a;
			a = b;
			b = tem;
		}
		System.out.println(a+" "+b+" "+c);
		sc.close();
		// TODO Auto-generated method stub

	}

}

package quiz01;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		
		
		
		Scanner sc =new Scanner(System.in);
		int cnt1=0;
		int cnt2=0;
		while(true) {
			int a = (int)(Math.random()*101);
			int b = (int)(Math.random()*101);
			
			System.out.println(a+" + "+b+" = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int r = sc.nextInt();
			if(a+b==r) {
				System.out.println("정답입니다.");
				cnt1++;
			}else if(r==0) {
				System.out.println("프로그램 정상 종료");
				break;
			}else {
				System.out.println("틀렸는데요?");
				cnt2++;
			}
			
		}
		System.out.println("정답:"+cnt1);
		System.out.println("오답:"+cnt2);
		sc.close();
		// TODO Auto-generated method stub

	}

}

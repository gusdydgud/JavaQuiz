package quiz15;

import java.util.Scanner;

public class TryCatch02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*100);
		int cnt= 0;
		while(true) {
			System.out.print("1과 100사이의 값을 입력하셈 ");
			try {
				
			
			int b = sc.nextInt();
			if(a>b) {
				System.out.println("더 큰수 입력하셈");
				cnt++;
				
			}else if(a<b) {
				System.out.println("더 작은 수 입력하셈");
				cnt++;
			}else {
				System.out.println("정답이다");
				cnt++;
				System.out.println("시도 횟수는:"+cnt);
				break;
			}
			} catch( Exception e) {
				System.out.println("잘못입력함 다시!!");
				cnt++;
				sc.nextLine();
			}
			
		}
		
	}

}

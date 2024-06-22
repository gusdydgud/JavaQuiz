package quiz01;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		/*
		 * 1~100까지 임의의 숫자를 하나 생성합니다 (정답 값)
		 * 스캐너를 통해서 값을 입력받고
		 * 랜덤수가 입력받은 값보다 작으면 " 더 작은수를 입력하셈"
		 * 랜덤수가 입력받은 값보다 크면 " 더큰수를 입력하셈"
		 * 정답을 맞추면 시도횟수를 출력하고 종료
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*101);
		int cnt=1;
		while(true) {
			System.out.print("정답입력");
			int r = sc.nextInt();
			if(r>a) {
				System.out.println("더 작은수를 입력하셈");
				cnt++;
			}else if(r<a) {
				System.out.println("더 큰수를 입력하셈");
				cnt++;
			}else {
				System.out.println("정답임 굳굳");
				System.out.println("시도횟수: "+cnt);
				break;
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}

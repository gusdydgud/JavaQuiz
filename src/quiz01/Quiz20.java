package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		
		/*가로세로를 입력받아서
		 * 가로 , 세로길이의 사각형을 출력합니다.
		 * 단 윤곽만 출력
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 1; i<=b;i++) {
			
			for(int j = 1;j<=a;j++) {
				if(i==1||i==b||j==1||j==a) {
				System.out.print("*");
				}//else if(j==1||j==a) {
					//System.out.print("*");
				else {
					System.out.print(" ");
				}
				
				
				
				
			}
			System.out.println();
		}
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}

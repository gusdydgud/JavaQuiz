package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		/*
		 * 스캐너를 활용해서 , 이름과, 나이를 입력받습니다.
		 * 20세이상이면 성인입니다. 
		 * 19세이하라면 미성년자입니다.
		 * 를 출력해주세요
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요>");
		int a = sc.nextInt(); //나이
		System.out.print("이름을 입력하세요>");
		sc.nextLine();//엔터빼주기
		
		String name = sc.nextLine();//이름
		System.out.println(name+"씨는 "+( a>19 ? "성인입니다":"미성년자입니다" ));
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}

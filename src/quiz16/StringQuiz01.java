package quiz16;

import java.util.Scanner;

public class StringQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너를 통해서 공백을 포함한 id를 입력받습니다.
		 * 2. 공백을 제거한 아이디가 5글자 미만이면, 다시 입력을받으세요.
		 * 3. 아이디는 반드시 소문자이어야 합니다.
		 * 
		 * 아이디가 5글자 이상이면, 아이디가 등록되었습니다 를 출력하고 프로그램 종료
		 */
		Scanner sc = new Scanner(System.in);
		String id;
		while(true) {
			id = sc.nextLine().trim();
			id = id.replace(" " , "");
			
			id = id.toLowerCase();
			if(id.length()>=5) {
				System.out.println("아이디가 등록되었습니다");
				break;
			}
			System.out.println("5글자 이상으로 입력해라");
			sc.nextLine();
		}
		System.out.println("등록된 아이디:"+id);
		
		
	}

}

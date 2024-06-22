package quiz17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz2_1 {
	
	public static void main(String[] args) {
		
		//간단한 회원정보 관리 프로그램
		//클래스와 인터페이스를 활용해서 분리.
		Scanner sc = new Scanner(System.in);
		IUserManagement manage = new UserManagement();
		
		
		
		while(true) {
		try {
				System.out.println("-----------------------");
				System.out.println("[1. 회원등록 2.회원전체보기 3.회원정보검색 4.회원정보삭제 5.프로그램종료");
				System.out.print("메뉴>");
				int menu = sc.nextInt();
				//메뉴에 따라서 기능을 나눔
				if(menu==1) {
					//스캐너로 이름, 나이를 입력받아서 User객체에 저장하고, 리스트에 하나추가
					System.out.print("이름 , 나이를 입력하세요>");
					String name = sc.next();
					int age = sc.nextInt();
					//메서드 호출
					manage.insert(name, age);
				}else if(menu==2) {
					//list안에 저장된 모든 회원정보를 반복문으로 출력.
					manage.printList();
					
				}else if(menu==3) {
					//찾을 이름을 입력받아서, 이름이 있다면, 이름과 나이를 출력합니다.
					//단. 찾는 이름이 없으면 "~~~ 님은 없습니다"를 출력합니다.
					System.out.print("찾으실 회원명 입력>");
					String name = sc.next();
					int c = manage.search(name);
						if(c==0) {
							System.out.println(name+"님은 없습니다");
						}
					}
				else if(menu==4) {
					
					//삭제할 이름을 입력받아서, 이름과 동일한 User객체를 삭제
					//단. 첫번째로 발견되는 User만 삭제.
					System.out.print("삭제할 회원님이름 입력>");
					String name = sc.next();
					manage.delete(name);
				}else if(menu==5) {
					//프로그램 종료
					break;
				}
			}
		 catch (Exception e) {
			System.out.println("번호 잘보고 입력해라");
			sc.nextLine();
		}
	}
		
		
	}

}

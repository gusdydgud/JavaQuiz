package quiz17;

import java.util.ArrayList;
import java.util.List;

public class UserManagement implements IUserManagement {
	//값을 저장할 리스트
	
	private List<UserVO> list = new ArrayList<>();
	//회원정보 추가 메서드
	public void insert(String name,int age) {
		UserVO user = new UserVO(name, age);
		list.add(user);
	}
	
	//회원정보 출력
	public void printList() {
		System.out.println(list.toString());
	}
	
	//회원정보 검색
	public int search(String name) {
		int c =0;
					for(int i =0;i<list.size();i++) {
						if(list.get(i).getName().equals(name)) {
							System.out.println(list.get(i).toString());
							c++;
						}
		
					
				}
					return c;

	}
	
	//회원정보 삭제
	public void delete(String name) {
		int i =0;
					while(true) {
						if(list.get(i).getName().equals(name)) {
							System.out.println(name+"회원님 삭제합니다");
							list.remove(i);
							break;
						}
						i++;
					}
	}
	
	
	
	
}

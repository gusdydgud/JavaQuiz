package quiz17;

import java.util.ArrayList;
import java.util.List;

public class ListQuiz01 {
	
	public static void main(String[] args) {
		/*
		// 1. 숫자를 저장하는 리스트를 만들고, 1~20까지 값을 순서대로 저장
		 * 2. UserVo를 저장할 수 있는 리스트를 만들고, User객체 3개를 저장
		 * 3. 2번에 저장된 리스트 안에 이름과 나이를 반복문으로 전부 출력.
		 * 4. 2번에 저장된 리스트안에, "홍길동" 이 있다면, 홍길동 객체의 이름과 나이를 출력
		 * 5. 2번에 저장된 리스트안에, "홍길동" 이 있다면, 홍길동 객체를 삭제.
		*/
			
		List<Integer> arr = new ArrayList<>();
		int i = 1;
		while(i<=20) {
			arr.add(i);
			i++;
		}
		List<UserVO> list = new ArrayList<>();
		UserVO p = new UserVO("홍길동",14);
		UserVO p1 = new UserVO("길복순",20);
		UserVO p2 = new UserVO("홍복순",30);
		list.add(p);
		list.add(p1);
		list.add(p2);
		for(int a=0;a<list.size();a++) {
			if("홍길동".equals(list.get(a).getName())){
				System.out.println(list.get(a).getName()+" "+list.get(a).getAge());
				list.remove(a);
			}
			
			
		}
		System.out.println(list.toString());
		
		
		
		
	}

}

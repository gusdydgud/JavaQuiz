package quiz01;

public class Quiz05 {

	public static void main(String[] args) {
		
		/*
		 * 랜덤한 정수 0~10 까지 생성하고, 5에서 빼주면 범위는 -5~5가 됩니다.
		 * 
		 * 이 값을 가지고, 3항 연산식을 이용해서 절대값(언제나 양수값)을 출력해주세요.
		 */
		int i = (int)(Math.random() * 11) -5;
		System.out.println("나온 랜덤값은 : "+i);
		System.out.println("절대값은 : "+( i>0 ? i :  -i) );
		int result;//결과값을 저장할 변수
		if(i>= 0) {
			System.out.println("절대값은 : " + i);
			result = i;
		}
		else {
			System.out.println("절대값은 : " + -i);
			result = -i;
		}
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}

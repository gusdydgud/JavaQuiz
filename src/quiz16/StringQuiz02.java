package quiz16;

import java.util.Scanner;

public class StringQuiz02 {
	
	public static void main(String[] args) {
		/* 주민번호 검증메서드 masking(String) : String
		 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
		 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
		 * 
		 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
		 * 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
		 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
		 * 4. 남, 여에 대한 정보를 출력해줍니다.
		 *  
		 * masking메서드를 만들어주세요 
		 * 검증데이터 950101-1000000 -> 남자
		 * 검증데이터 950101-2000000 -> 여자
		 * 검증데이터 9501012000000 -> 여자
		 * 검증데이터 950101-5000000 -> 예외
		 * 검증데이터 9501015000000 -> 예외
		 * 검증데이터 950101511111 -> 예외
		 */
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		try {
			System.out.println(masking(str));
		} catch (IllegalArgumentException e) {
			System.out.println("예외: " + e.getMessage());
		}
	}
	
	public static String masking(String str) {
		// Remove any hyphens
		str = str.replace("-", "");
		
		// Check if the length is 13
		if (str.length() != 13) {
			throw new IllegalArgumentException("주민등록번호는 13자리여야 합니다.");
		}
		
		// Check gender character and determine gender
		char genderChar = str.charAt(6);
		String gender;
		if (genderChar == '1') {
			gender = "남자";
		} else if (genderChar == '2') {
			gender = "여자";
		} else {
			throw new IllegalArgumentException("성별코드는 1 또는 2여야 합니다.");
		}
		
		// Print the gender
		System.out.println(gender);
		
		// Masking
		String masked = str.substring(0, 6) + "-*******";
		return masked;
	}
}

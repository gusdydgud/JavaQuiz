package quiz21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	
	public static void main(String[] args) {
		
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(갓혜자도시락) 6,000";
		
		String[] arr = {str, str2, str3};
		
		//arr 상품번호, gs25, (상품명), 가격 을 정규표현식으로 나눠서 출력.
		String code = "[0-9]+-[0-9]+";
		String gs = "GS[0-9]*";
		String menu = "\\([가-힣]+\\)";
		String won = "[0-9]+,[0-9]*원*";
		
		for(int i =0;i<3;i++) {
			Matcher m1 = Pattern.compile(code).matcher(arr[i]);
			Matcher m2 = Pattern.compile(gs).matcher(arr[i]);
			Matcher m3 = Pattern.compile(menu).matcher(arr[i]);
			Matcher m4 = Pattern.compile(won).matcher(arr[i]);
			if(m1.find()&&m2.find()&&m3.find()&&m4.find()) {
				
				System.out.print("상품번호:"+m1.group()+" 판매처:"+m2.group()+" 메뉴"+m3.group()+" 가격:"+m4.group());
				System.out.println();
			}
			
		}
		
	}

}

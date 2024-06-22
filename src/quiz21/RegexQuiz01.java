package quiz21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {
	
	public static void main(String[] args) {
		
		//가격의 패턴을 찾아 보시요. 3개나 있습니다
		
		String str = "헐2,500원 ㅋㅋㅋ 찾아보시지 1,200,000원 6000원".replace(",", "");
		
		String won = "[0-9]+원";
		Matcher m1 = Pattern.compile(won).matcher(str);
		while(m1.find()) {
			System.out.println(m1.group());
		}
		
	}

}

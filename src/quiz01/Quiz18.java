package quiz01;

public class Quiz18 {

	public static void main(String[] args) {
		
		int cnt=0;
		int sum=0;
		
		
		for(int i = 7;i<=100;i+=7) {
			if(i%7==0) {
				System.out.print(i+" ");
			}
		}
		for(int i = 1;i<=100;i++) {
			if(i%9==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		for(int i =50;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
		String str = "";
		for(char i='A';i<='Z';i++) {
			str+=i;// str = str +i 
			System.out.print(i);
			
		
		}
		System.out.println();
		System.out.println(str);
		
		
		
		
		// TODO Auto-generated method stub

	}

}

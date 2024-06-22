package quiz01;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int i =1;
		 int cnt = 0;
		 while(i<=a) {
			 if(i%b==0) {
				 if(i+1==a) {
					 System.out.println((cnt+1));
				 }else {
					 
					 System.out.print((cnt+1)+" ");
				 }
			 }
			 cnt++;
			 i++;
				 
		 }
		 sc.close();
		// TODO Auto-generated method stub

	}

}

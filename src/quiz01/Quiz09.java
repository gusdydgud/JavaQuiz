package quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String m = sc.nextLine();
		switch(m) {
		case "수박":
			System.out.println("3만원");
			break;
		case "사과":
			System.out.println("4만원");
			break;
		case "멜론":
			System.out.println("5만원");
			break;
		case "귤":
			System.out.println("6만원");
			break;
		default:
			System.out.println("없는메뉴");
		}
		sc.close();
		
		// TODO Auto-generated method stub

	}

}

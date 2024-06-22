package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz28 {

	public static void main(String[] args) {
		
		/*
		 * 사용자에게 수정하고싶은 이름을 입력받아서,
		 * 해당 이름이 존재하면, 수정할 이름을 새롭게 입력받습니다.
		 * 만약에 값이 없으면 "이름은 존재하지 않습니다"
		 * 문자열의 비교
		 * 문자열.equals(비교할문자열)
		 * 
		 */
		
		String arr[] = {"강타","문희준","토니안","이재원","장우혁"};
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 학생의 별명을 입력>");
		String c = sc.nextLine();
		String cg;
		int cnt=0;
		for(int i = 0; i<arr.length;i++) {
			if(c.equals(arr[i])){
				System.out.println(c+"별명을 변경합니다.");
				System.out.print(">");
				cg = sc.next();
				arr[i] = cg;
			}else {
				cnt++;
			}
			
		}
		if(cnt==arr.length) {
			System.out.println("별명이 존재하지 않습니다.");
		}else {
		System.out.println(Arrays.toString(arr));
		}
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}

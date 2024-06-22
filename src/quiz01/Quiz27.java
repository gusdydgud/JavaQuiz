package quiz01;

import java.util.Arrays;

public class Quiz27 {

	public static void main(String[] args) {
		
		/*
		 * 맨앞자리에 추가
		 * 1.새로운 배열+1생성
		 * 2.기존배열을 다음인덱스번째로 옮겨담기
		 * 3.앞에 data를 추가
		 */
		
		int arr[] = {10,20,30,40,50};
		int data = 100;
		int narr[] = new int[arr.length+1];
	
	
		for(int i =0;i<arr.length;i++) {
			 narr[i+1]= arr[i];
			 
		}
		arr = narr;
		arr[0] = data;
		System.out.println(Arrays.toString(arr));
		
		
		// TODO Auto-generated method stub

	}

}

package quiz01;

import java.util.Scanner;

public class Quiz25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int arr[] = new int[i];
		
		for(int a = 0 ; a<i;a++ ) {
			arr[a] = sc.nextInt();
		}
		int max=-1000000;
		int min= 1000000;
		for(int a=0;a<arr.length;a++) {
			if(max<arr[a]) {
				max = arr[a];
				
			}
			if(min>arr[a]) {
				min = arr[a];
			}
		}
		System.out.println(min+" "+max);
		sc.close();
		// TODO Auto-generated method stub

	}

}

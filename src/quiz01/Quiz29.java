package quiz01;

import java.util.Scanner;

public class Quiz29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[][]=new int[9][9];
		int max =-1;
		int x=0;
		int y=0;
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j]>max) {
					max = arr[i][j];
					x=i+1;
					y=j+1;
				}
			}
		}
		System.out.println(max);
		System.out.print(x+" "+y);

		
		// TODO Auto-generated method stub

	}

}

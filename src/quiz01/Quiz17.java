package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		int arr[] = {1000,500,100,50,10};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr2[] = new int[5];
		int i = 0;
		while(i<arr.length) {
			arr2[i] = n/arr[i];
			n = n - arr2[i] * arr[i];
			System.out.print(arr[i]+" "+arr2[i]+" ");
			i++;
			
		}
		sc.close();
//		System.out.println();
		
		// TODO Auto-generated method stub

	}

}

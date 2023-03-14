package java0314;

import java.util.Scanner;

public class 연속된숫자의순열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] arr = sc.next().toCharArray();
		int n = sc.nextInt();
		
		long[] fac = new long[arr.length+1];
		fac[0]=1;fac[1]=1;
		for (int i = 2; i < arr.length; i++) {
			fac[i] = fac[i-1]*i;
		}
		
		System.out.print(arr[(int) ((n-1)/fac[arr.length-1])]);
		System.out.print(arr[(int) (((n-1)%fac[arr.length-1])/fac[arr.length-2])]);
		//System.out.println(arr[n-n/fac[arr.length-1]]);
		//System.out.println(n-n-n/fac[arr.length-1]);*/
		
		//int[] arr = {1,2,3};
		
	}
}

package java0313;

import java.util.Iterator;
import java.util.Scanner;

public class 백준_2750_수정렬_삽입정렬_김효진 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int idx;
		for (int i = 1; i < n; i++) {
			int min = arr[i]; idx = i;
			for (int j = i-1; j >=0; j--) {
				if (arr[j]>min) {
					arr[j+1] = arr[j];
					idx=j;
				} else break;
			}
			arr[idx] = min;
		}
		
		for (int a : arr) {
			System.out.println(a);
		}
	}
}

package java0313;

import java.util.Iterator;
import java.util.Scanner;

public class 백준_2750_수정렬_선택정렬_김효진 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int minIdx, min;
		int temp=0;
		for (int i = 0; i < n-1; i++) {
			minIdx = i; min = arr[minIdx];
			for (int j = i; j < n; j++) {
				if (min>arr[j]) {
					min = arr[j];
					minIdx = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}
}

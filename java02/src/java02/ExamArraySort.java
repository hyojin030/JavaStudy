package java02;

import java.util.Arrays;
import java.util.Random;

public class ExamArraySort {
	public static void main(String[] args) {
		//10개의 난수를 저장, 정렬
		Random r = new Random(100);
		
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=r.nextInt(100); // 0~99 난수 생성
		}
		//출력
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("");
		//오름차순 정렬
		int temp=0;
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1-i; j++) {
//				if (arr[j]>arr[j+1]) {
//					temp = arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

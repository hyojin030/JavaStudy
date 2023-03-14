package java0314;

import java.util.Arrays;
import java.util.Iterator;

public class 연속된숫자의순열_스왑 {
	
	public static void main(String[] args) {
		for (int i = 0; i <=3; i++) {
			int[] arr = new int[] {1,2,3,4};
			int temp = arr[0];
			arr[0] = arr[0+i];
			arr[0+i] = temp;
			System.out.println(Arrays.toString(arr));
			
			
//			for (int j = 0; j <=2; j++) {
//				temp = arr[2];
//				arr[2]=arr[1];
//				arr[1]=temp;
//				System.out.println(Arrays.toString(arr));
//				
//				temp = arr[2];
//				arr[2]=arr[3];
//				arr[3]=temp;
//				System.out.println(Arrays.toString(arr));
//			}
			temp = arr[3];
			arr[3] = arr[2];
			arr[2] = temp;
			
			System.out.println(Arrays.toString(arr));
		}
	}
}

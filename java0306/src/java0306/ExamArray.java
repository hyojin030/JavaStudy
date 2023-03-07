package java0306;

public class ExamArray {
	public static void main(String[] args) {
	int arr1[] = new int[3];
	arr1[0]=100;
	arr1[1]=200;
	arr1[2]=300;
	System.out.println(arr1.length);
	
	int[] arr2 = new int[] {100,200,300};
	//int[][] arr3 = new int[][] {arr1, arr2};
	
	int[][] arr3 = new int[][] {{1,2,3},{4,5,6}};
	int[][] arr4 = new int[][] {{1,2},{3,4,5,6}};
	//arr3->2차원배열변수  arr3[0]->1차원배열변수
	
	for (int is : arr2) {
		System.out.println(is);
		}
	
	}
}

package java02;

public class ExamForEaxh {
	public static void main(String[] args) {
		int arr[] = new int[] {100, 200, 300};
		
		for (int i=0; i<arr.length; i++) {
			int j = arr[i];
			System.out.println(j);
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}
}

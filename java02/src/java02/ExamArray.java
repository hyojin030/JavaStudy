package java02;

public class ExamArray {
	//변수 : heap에 생성 
	public static void main(String[] args) {
		//변수 : method 안은 stack에 생성
		int[] arr; //선언 == int arr[]
		//System.out.println(arr); //바로쓰면 오류
		arr = new int[3];
		System.out.println(arr);
		
		int[] arr2 = new int[3]; //초기화 (0으로)
		System.out.println(arr2[0]);
		
		int[] arr3 = null; //초기화 (null만 가능)
		System.out.println(arr3); //indexing X
		
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		System.out.println("arr2의 길이는 "+arr2.length);
		//System.out.println(arr3.length); //Cannot read the array length because "arr3" is null
	}

}

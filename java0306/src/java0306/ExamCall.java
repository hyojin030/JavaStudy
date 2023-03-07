package java0306;

public class ExamCall {
	public static void main(String[] args) {
		int a = 100;
		change(a);
		System.out.println("a="+a);
		
		int[] arr = new int[] {100,200,300};
		change2(arr);
		System.out.println("arr[1]="+arr[1]);
	}

	private static void change2(int[] arr) { //call by reference
		// TODO Auto-generated method stub
		arr[1]=900;
	}

	private static void change(int a) { //call by value
		// TODO Auto-generated method stub
		a=200;
	}
}

package java0313;

public class Exam재귀 {
	static int factorial(int n) {
		if (n==0) return 1;	//종료 조건 검사
		return factorial(n-1)*n; //종료 아니면 로직처리, 재귀함수 실행
	}
	public static void main(String[] args) {
		System.out.println(factorial(999999));
	}
}

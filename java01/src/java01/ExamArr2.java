package java01;

public class ExamArr2 {
	public static void main(String[] args) {
		int[] points = {100, 200, 300}; //초기화1 : 변수 선언 시에만 사용
		int[] points2 = new int[]{100, 200, 300}; // 초기화2 : 선언과 재할당시 언제나 가능
		
		//points = {300, 400, 500} // 에러: 초기화할때만 가능
		points = new int[] {300, 400, 500};
	}
}

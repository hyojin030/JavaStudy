package java02;
//2차원 배열 arr에 구구단 결과값을 저장하는 코드
//단, 단번호와 인덱스를 동일하게
//예: arr[2][1] => 2 arr[2][2] => 4
//생성 따로, for문으로 값 저장

public class Exam구구단배열 {
	public static void main(String[] args) {

		int arr[][] = new int[10][10];
		for (int dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				arr[dan][i] = dan*i;
			}
		}
		System.out.println(arr[9][9]);
	}
}

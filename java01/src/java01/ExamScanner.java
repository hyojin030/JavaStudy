package java01;

import java.util.Scanner;

public class ExamScanner {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int s1 = sc.nextInt(); // 문자열읽기
//		System.out.println("읽은 숫자: "+s1);
//		s1 = sc.nextInt(); // 문자열읽기
//		System.out.println("읽은 숫자: "+s1);
		
		// 한 줄 전체 읽기
		Scanner sc2 = new Scanner(System.in);
		String s2 = sc2.nextLine();
		System.out.println("읽은 줄: "+s2);
		
	}

}

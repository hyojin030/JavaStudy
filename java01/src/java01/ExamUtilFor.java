package java01;

import java.util.Random;
import java.util.Scanner;

public class ExamUtilFor {
	public static void main(String[] args) {
		Random random = new Random();
		int i = random.nextInt(100); // 0-99 사이 난수생성
		System.out.println("난수="+i);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~99사이 숫자를 입력하세요>> ");
		int ans= sc.nextInt();
		if (i == ans) {
			System.out.println("정답");
		}else if (i < ans) {
			System.out.println("숫자를 낮춰주세요");
		}else {
			System.out.println("숫자를 높여주세요");
		}
	}
}

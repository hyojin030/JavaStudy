package java01;

import java.util.Scanner;

public class ExamSwitch {
	public static void main(String[] args) {
		// 학점 받아서 등급 출력
		 Scanner sc = new Scanner(System.in);
		 System.out.println("학점을 입력하세요>>");
		 int ans = sc.nextInt();

		 //정수/정수 => 정수 99/10 = 9
		 //정수/실수 = 실수 99/10.0 = 9.9
		 switch(ans/10) {
		 case 10:
			 System.out.println("A");
			 break;
		 case 9:
			 System.out.println("A");
			 break;
		 case 8:
			 System.out.println("B");
			 break;
		 case 7:
			 System.out.println("C");
			 break;
		 case 6:
			 System.out.println("D");
			 break;
		 default:
			 System.out.println("F");
		 }
	}
}

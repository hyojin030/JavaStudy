package java01;

public class ExamString2 {

	public static void main(String[] args) {
		String s1 = "1";
		String s2 = s1 + 100;
		System.out.println(s2);
		
		char c1 = 'A';
		int i = c1+100; // char -> error 크기가 작아서
		System.out.println((char)i); //???
		System.out.println((char)165); //???
		
		
	}

}

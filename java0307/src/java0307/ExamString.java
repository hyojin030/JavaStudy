package java0307;

public class ExamString {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc"; //뒤져서 "abc" 나오면 그 주소값을 반환
		String s3 = new String("abc"); //heap 공간에 새로 만들어짐
		String s4 = new String("abc");
		
		System.out.println(s1==s2); //주소값 비교
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
		//문자열값을 비교
		System.out.println(s1.equals(s3)); 
		System.out.println(s4.equals(s3)); 
		
		s1 = s1 + s1;
		System.out.println(s1);
	
	}
}

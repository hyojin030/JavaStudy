package java0308;

public class Exam형변환 {
	public static void main(String[] args) {
		byte b = (byte)200; //127~-128
		System.out.println(b);
		
		short sh = b;
		System.out.println(sh);

		char c = '갂';
		b = (byte)c;
		System.out.println(b);
		
		String s1 = "100";
		char d = s1.charAt(0);
		System.out.println(d);
		
		int diff = (s1.charAt(0) - '0')*100;
		diff += (s1.charAt(1) - '0')*10;
		diff += s1.charAt(2)-'0';
		System.out.println(diff);
		
		int diff = s1.charAt(0)-'0';
		diff*=10;
		diff+=(s1.charAt(1)-'0');
		diff*=10;
		diff+=(s1.charAt(2)-'0');
		System.out.println(diff);
		
	}
}

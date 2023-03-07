package java0307;

public class ExamStringBuilder {
	public static void main(String[] args) {
		String s = "0123456789";
		String s1 = s;
		long start = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			s1+=s;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);

		//StringBuffer, StringBuilder
		StringBuilder sb = new StringBuilder("0123456789");
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append(s);
		}
		String s2 = sb.toString();
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
		System.out.println(s1.equals(s2));

		
	}
}

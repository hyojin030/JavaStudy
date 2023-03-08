package java0308;

import java.util.ArrayList;

public class ExamList {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList();
		a1.add("abc");
		a1.add("def");
		a1.add("ghi");
		System.out.println(a1.size());
		
		String e = a1.get(2);
		System.out.println(e);

		String r = a1.remove(1);
		System.out.println("지워진 값= "+r);
		System.out.println(a1.size());
		System.out.println(a1);
		a1.add(0,r);
		System.out.println(a1);
	}
}

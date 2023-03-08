package java0308;

public class ExamMath {
	public static void main(String[] args) {
		System.out.println(Math.round(1.2)==1);
		
		double r = Math.random();
		System.out.println(r);
		//r: 0.0~0.999999
		//1~100사이 난수 생성하려면?
		r *= 100;
		int i = (int)r +1;
		System.out.println(i);
		
	}
}

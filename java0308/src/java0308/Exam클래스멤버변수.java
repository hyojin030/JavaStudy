package java0308;

public class Exam클래스멤버변수 {
	public static void main(String[] args) {
		AA a1 = new AA(); //instance 생성
		a1.i = 100;
		AA a2 = new AA();
		a2.i = 200;
		
		AA.j=300;
		a1.j=100;
		System.out.println(a2.j);
		a1.prn2();
		AA b = new BB();
		b.prn2();
		
		BB c = new BB();
		c.prn2();
	}
}

class AA{
	int i; //instance 변수 -> instance를 만든 후 사용가능 //heap에 생성
	static int j; // class 멤버변수 -> 클래스 영역에 생성 AA.j
	
	void prn() { //멤버 method
		System.out.println(i+", "+j);
	}
	static void prn2() {
		//AA a1 = new AA();
		System.out.println("A's prn2()");
	}
}

class BB extends AA{
	static void prn2() {
		System.out.println("B's par2()");
	}
}
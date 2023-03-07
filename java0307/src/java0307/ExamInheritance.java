package java0307;

public class ExamInheritance {
	public static void main(String[] args) {
		S s1 = new S("홍", 20, "컴공");
		//s1.name = "홍";
		//s1.age = 20;
		//s1.jeongong = "컴공";
		System.out.println(s1);
	} //end main
} //end class

class P{
	private String name;	//자식클래스에서 접근이 불가  protected:상속O, 다른클래스X
	private int age;
	
	public P(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() { return name+", "+age;}
}

class S extends P{
	String jeongong;
	
	public S(String name, int age, String jeongong) {
		super(name, age); //부모 클래스의 생성자를 호출
		this.jeongong=jeongong;
	}

	public String toString() {
		//return name+", " //->method영역 (name뒤짐) ->class영역(S class) -> 부모클래스
			//	+age+", "+jeongong;
		return super.toString()+", "+jeongong;
	}
}
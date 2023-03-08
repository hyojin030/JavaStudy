package java0308;

public class Test {
	public static void main(String[] args) {
		//Child c = new Child();
		System.out.println(c.name);
		c.print();
		
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
	}
}

class Parent{
	String name="a";
	int age;
	public Parent() {
		System.out.println("부모 생성자");
	}
	public void print() {
		System.out.println("parent");
	}
}

class Child extends Parent{
	int ch;
	String name="b";
	public Child() {
		System.out.println("자식 생성자");
	}
	public void print() {
		System.out.println("child");
	}
}
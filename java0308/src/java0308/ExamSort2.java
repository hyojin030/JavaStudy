package java0308;

import java.util.ArrayList;
import java.util.Collections;

public class ExamSort2 {
	public static void main(String[] args) {
		// 내가 만든 클래스 정렬
		// 1 클래스가 comparable 인터페이스 구현
		// 2 comparator 구현체 생성
		ArrayList<Person> pa = new ArrayList<>();
		pa.add(new Person("홍",30));
		pa.add(new Person("김",20));
		pa.add(new Person("박",35));
		
		Collections.sort(pa);
		System.out.println(pa);
	}
}

class Person implements Comparable<Person>{

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}

	@Override
	public int compareTo(Person o) {
		//작성 공식: this.변수 - 파라미터.변수 (ascending)
		//return this.age - o.getAge();
		return o.getAge() - this.age;
	}
	
}
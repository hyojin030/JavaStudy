package java0306;

//자바 doc 코멘트
/**
 * 사람에 대한 기본 정보 정의용<br>
 * 이름, 나이
 * @author student
 *
 *
 */
public class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	/**
	 * 이름과 나이를 입력받아 초기화
	 * @param name 이름
	 * @param age 나이
	 */
	public Person(String name, int age) {
		System.out.println("this="+this);
		this.name = name;
		this.age = age;
	}

	public Person(int age, String name) {
		this(name, age); //생성자 호출
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { 
		//변수 검색 : 메서드 내부변수 없으면 멤버변수검색 없으면 오류
		return (name+"의 나이는 "+age);
	}
}

package java0307;

public class ExamPerson {
	public static void main(String[] args) {
		Person[] pa = new Person[10]; //Person을 저장할 배열 객체 생성 (Person 객채X)
		System.out.println(pa[0]); //null
		pa[0] = new Person("홍길동", 30);
		pa[1] = new Person("김길동", 32);
	}
}

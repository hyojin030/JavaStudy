package java0306;

public class ExamPerson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("홍길동");
		p.setAge(30);
		System.out.println(p); //참조형변수를 부르면 내부에서 자동으로 toString 호출
		System.out.println(p.toString()); //System.out.println(p.name+"의 나이는 "+p.age);
		System.out.println(p.getName()+"의 나이는 " +p.getAge());
		
		Person p2 = new Person();
		p2.setName("김길동");
		p2.setAge(32);
		System.out.println(p2.getName()+"의 나이는 " +p2.getAge());
		
		Person p3;
		//System.out.println(p3); local 변수는 초기화 안하면 에러
		//System.out.println(p3.name);
	}
}

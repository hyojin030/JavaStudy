package java0307;

public class ExamStudent {
	public static void main(String[] args) {
		//학생
		Student st1 = new Student("김학생", 20, "컴공");
		System.out.println(st1);
		
		//직원(이름 나이 부서명-dept)
		Emp e1 = new Emp("김대리", 32, "영업부");
		System.out.println(e1);
		
		//다형성
		Person p = st1; //p.변수타입내멤버들 (까지만 가능) 
		System.out.println(p.toString());

		Person[] pa = new Person[5];
		pa[0] = st1; pa[1]=e1; pa[2] = new Person("김길동",30);
		System.out.println(pa[0].toString());
		System.out.println(pa[1].toString());
		System.out.println(pa[2]);
		
		
		pa[0]=new Student("김", 20, "컴공");
		pa[1]=new Student("박", 20, "사회학");
		pa[2]=new Emp("김대리", 32, "영업");
		pa[3]=new Emp("박과장", 35, "개발");
		pa[4]=new Student("황", 21, "경영");
	}
}

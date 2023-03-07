package java0307;

public class ExamInterface {
	public static void main(String[] args) {
		SwimStudent s1 = new SwimStudent("김평형", 21, "체육");
		System.out.println(s1);
		s1.swim();
		
		SwimCar c1 = new SwimCar("소나타 2022", "승용");
		c1.swim();
		
		// 수영할 수 있는 객체 모음
		Swimmable[] sarr = new Swimmable[2];
		sarr[0]=s1;
		sarr[1]=c1; //swim()만 가능 / car(model, type) 접근안됨  Swimmable에 정의된 method만 가능
		for (int i = 0; i < sarr.length; i++) {
			sarr[i].swim();
		}
		
		//자동차 기능을 위해 형변환
		Car cc = (Car)sarr[1]; //car 기능은 가능, swim 기능은 불가능
		//car, swim 다 하고싶으면 SwimCar로 형변환
		
		Swimmable sw = s1;
		sw.swim();
		sw = c1;
		sw.swim();
	}
}

interface Swimmable{
	void swim();
}

class Car{
	String model, type; //type:승용차, 화물차, ...
	public Car(String model, String type) {
		this.model = model;
		this.type = type;
		
	}
	public void drive() {
		
	}
}

class SwimCar extends Car implements Swimmable{

	public SwimCar(String model, String type) {
		super(model, type);
	}

	@Override
	public void swim() {
		System.out.println("수중프로펠러 가동🥽🥽");
	}
	
}

//implements Swimmable로 간편하게 swim()이 구현된 class를 찾을 수 있음
//Swimmable에 정의된 기능을 구현한 class를 간편하게 찾을 수 있음
class SwimStudent extends Student implements Swimmable{

	public SwimStudent(String name, int age, String jeongong) {
		super(name, age, jeongong);
	}

	@Override
	public void swim() {
		System.out.println("평형으로 수영하기🏊‍♀️🏊‍♀️");
	}
	
}
package java0308;

public class ExamShape {
	public static void main(String[] args) {
		// 자바로 그림판 작성 // 만든 도형 정보 저장하는 클래스
		// Line(x1, y1, x2, y2) , Circle(x1, y1, radius) -> Shape (Parent)
		
		//다형성
		//부모타입 객체에 자식타입을 저장할 때
		//오버라이딩 된 메소드가 있다면 자식꺼 씀 (동적바인딩)
		//자식클래스의 이외의 메소드 호출은 못함
		Shape l1 = new Line(1,1,3,3);
		System.out.println(l1);
		Circle c1 = new Circle(2,2,5);
		System.out.println(c1);
		
	}
}

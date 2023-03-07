package java0307;

public class ExamShape {

	public static void main(String[] args) {
		//자바로 그림판 제작 가정
		//관리대상은 도형 정보. 선, 사각, 원
		//Parent: Shape  Child: Line, Rect, Circle
		Shape[] sarr = new Shape[3];
		sarr[0] = new Line(1,1,3,3); //x1 y1 x2 y2
		sarr[1] = new Circle(2,2,5); //x1 y1 r
		
		Line l = new Line(1,1,3,3);
		l.draw(); //실제객체에서 오버라이딩 된 메소드가 동작(자식클래스의 메소드)
		
	}

}

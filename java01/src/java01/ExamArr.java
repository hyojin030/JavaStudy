package java01;

public class ExamArr {
	public static void main(String[] args) {
		int [] points; //선언
		points= new int[3]; //할당 <- 생성
		//points = null;
		//System.out.println(points);
		
		points[0]=100;
		points[1]=200;
		points[2]=300;
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}
	}
}

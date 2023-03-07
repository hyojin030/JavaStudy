package java02;

public class Quiz02 {

	public static void main(String[] args) {
		int jumsu = 100;
		
		//break가 없으면 쭉 내려오면서 다 실행 //break 만날 때까지
		// if jumsu = 80
		
		switch (jumsu/10) {
		case 10:
		case 9:
			System.out.print("A");
		case 8:
			System.out.print("B");
		case 7:
			System.out.print("C");
		default:
			System.out.print("F");

		}
	}

}

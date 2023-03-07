package java0306;

public class Calc {
	public Calc() { //기본생성자
		// TODO Auto-generated constructor stub
		System.out.println("생성");
	}
	public int plus(int i, int j) {
		return i+j;
	}
	public int plus(double i, int j) { //method overloading
		return (int) i+j;
	}
	public int plus(int i, double j) { //method overloading
		return (int) (i+j);
	}
	public double plus(double i, double j) { //method overloading
		return i+j;
	}

	public int minus(int i, int j) {
		return i-j;
	}

	public double divide(int i, int j) {
		return (double)i/j; //1.0*i/j
	}
	
}


package java0307;

public class Emp extends Person{
	String dept;

	public Emp(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return super.toString()+", dept="+dept;
	}
	
	
}

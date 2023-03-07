package java01;

import java.util.Iterator;

public class Examfor {
	public static void main(String[] args) {
		System.out.println("***구구단***");
		for (int j=2;j<=9;j++) {
			System.out.println("**"+j+"단**");
			for (int i = 1; i <= 9; i++) {
				System.out.println(j+"*"+i+"="+(j*i));
			}
			//end for dan(j)
		}
	}
}

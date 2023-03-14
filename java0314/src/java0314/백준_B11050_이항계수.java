package java0314;

import java.util.Iterator;
import java.util.Scanner;

public class 백준_B11050_이항계수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double[][]D = new double[N+1][N+1];
		
		for (int i = 0; i < D.length; i++) {
			D[i][0]=1;
			D[i][i]=1;
			D[i][1]=i;
		}
		
		for (int i = 3; i < D.length; i++) {
			for (int j = 2; j < i; j++) {
				D[i][j]=D[i-1][j-1]+D[i-1][j];
			}
		}
		System.out.println(D[N][K]);
		
		double ans=1;
		for (int i = N; i > N-K; i--) {
			ans*=i;
		}
		for (int i = 1; i <=K; i++) {
			ans/=i;
		}
		System.out.println(ans);
		
		double [] arr = new double[N+1];
		arr[0]=1;
		arr[1]=1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1]*i;
		}
		System.out.println(arr[N]/(arr[K]*arr[N-K]));
	}
}

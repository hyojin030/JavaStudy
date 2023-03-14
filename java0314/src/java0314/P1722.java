package java0314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1722 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int Q = Integer.parseInt(st.nextToken());
		
		boolean[] visited = new boolean[21];
		
		long F[] = new long[21];
		F[0]=1;
		for (int i = 1; i < F.length; i++) {
			F[i] = F[i-1]*i;
		}
		System.out.println(Arrays.toString(F));
		switch (Q) {
		case 1:
			long K = Integer.parseInt(st.nextToken());
			int[] ans = new int[N];
			for (int i = 0; i < N; i++) {
				ans[i] = (int)(K/F[N-i]);
				
			}
			System.out.println(Arrays.toString(ans));
			break;
		case 2:
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			break;
		}
	}
}

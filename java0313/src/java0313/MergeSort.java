package java0313;

//배열 병합
public class MergeSort {
	
	static void Merge(int[] a, int na, int[]b, int nb, int[]c) {
		int pa=0, pb=0, pc=0;
		while(pa<na && pb<nb) {
			c[pc++] = (a[pa]<=b[pb])?a[pa++]:b[pb++];
		}
		while (pa<na) c[pc++] = a[pa++];
		while (pb<nb) c[pc++] = b[pb++];
	}
	public static void main(String[] args) {
		int a[] = {2, 4, 6, 8, 11, 13};
		int b[] = {1, 2, 3, 4, 9, 16, 21};
		int c[] = new int[13];
		
		Merge(a, a.length, b, b.length, c);
		
		for (int i : c) {
			System.out.print(i+" ");
		}
	}
}

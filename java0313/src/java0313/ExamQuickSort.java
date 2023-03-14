package java0313;

public class ExamQuickSort {
	public static void main(String[] args) {
		int[]x = {5, 8, 4, 2, 6, 1, 3, 9, 7};
		QuickSort(x, 0, x.length-1);
		
		for (int i : x) {
			System.out.print(i+" ");
		}
	}
	
	static void QuickSort(int[]a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl+pr)/2];
		
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if (pl<=pr) Swap(a, pl++, pr--);
		} while(pl<=pr);
		
		if (left<pr)  QuickSort(a, left, pr);
		if (right>pl)  QuickSort(a, pl, right);
	}
	
	static void Swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=temp;
	}
}

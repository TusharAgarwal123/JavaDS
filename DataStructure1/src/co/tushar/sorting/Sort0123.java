package co.tushar.sorting;

public class Sort0123 {

	public static void main(String[] args) {

		int ar[] = { 0, 2, 3, 1, 0, 3, 3, 2, 2, 1, 0, 1,3,1,0,3,3 };
		int i = 0;
		int j = 0;
		int k = ar.length - 1;
		int m = ar.length - 1;

		while (i <= k) {

			if (ar[i] == 1) {
				i++;
			} else if (ar[i] == 0) {
				swap(ar, i, j);
				i++;
				j++;
			} else if (ar[i] == 2) {
				swap(ar, i, k);
				k--;
			} else {
				swap(ar, i, m);
				m--;
			}
		}
		
		for(int x:ar) {
			System.out.print(x+" ");
		}

	}

	public static void swap(int ar[], int i, int j) {
		int tm = ar[i];
		ar[i] = ar[j];
		ar[j] = tm;
	}

}

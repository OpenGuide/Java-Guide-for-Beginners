import java.util.Scanner;
public class merge_sort
{
	/**
	* Merge sorting
	* a divide and conquer based sorting method.
	* You divide the array into two parts from the middle.
	* Now sort both the parts and merge them later on.
	* You keep dividing till you get arrays of size = 1,
	* because an array of size = 1 is always sorted.
	*/
	public static void sorting(int[] arr, int i, int j)
	{
		if (i < j) {
			int m = (i + j) / 2;
			sorting (arr, i, m);
			sorting (arr, m + 1, j);
			merging (arr, i, m, j);
		}
	}
	public static void merging (int[] arr, int i, int m, int j)
	{
		int[] l = new int[m - i + 1];
		int[] r = new int[j - m];
		int x, y, a, b;
		for (x = 0, a = i; a <= m; ++x, ++a) {
			l[x] = arr[a];
		}
		for (y = 0; a <= j; ++y, ++a) {
			r[y] = arr[a];
		}
		for (a = 0, b = 0; a < x && b < y; ++i) {
			if (l[a] <= r[b]) {
				arr[i] = l[a];
				++a;
			} else {
				arr[i] = r[b];
				++b;
			}
		}
		for ( ; a < x; ++a, ++i) {
			arr[i] = l[a];
		}
		for ( ; b < y; ++b, ++i) {
			arr[i] = r[b];
		}
	}
	public static void display(int[] arr)
	{
		int i;
		for (i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		int i, size;
		Scanner Sc = new Scanner (System.in);
		System.out.print("Enter size of array :- ");
		size = Sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter elements :- ");
		for (i = 0; i < size; ++i) {
			arr[i] = Sc.nextInt();
		}
		sorting(arr);
		System.out.println("Sorted array :-");
		for (i = 0; i < size; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

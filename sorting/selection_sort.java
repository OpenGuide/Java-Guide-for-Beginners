import java.util.Scanner;
public class selection_sort
{
	public static void sorting(int[] arr)
	{
		// Selection sorting in Ascending Order
		int i, j, p, temp;
		for (i = 0; i < arr.length; ++i) {
			p = i;
			for (j = i + 1; j < arr.length; ++j) {
				p = arr[j] < arr[p] ? j : p;
			}
			temp = arr[i];
			arr[i] = arr[p];
			arr[p] = temp;
		}
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

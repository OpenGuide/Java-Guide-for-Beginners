import java.util.Scanner;
public class selection_sort
{
	public static void sorting(int[] arr)
	{
		// Selection sorting in Ascending Order
		int i, j, key;
		for (i = 1; i < arr.length; ++i) {
			key = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > key; --j) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = key;
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

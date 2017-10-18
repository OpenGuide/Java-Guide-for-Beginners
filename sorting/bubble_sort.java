import java.util.Scanner;
public class bubble_sort
{
	public static void sorting(int[] arr)
	{
		// Bubble sorting in Ascending Order
		int i, j, temp;
		for (i = 0; i < arr.length; ++i) {
			for (j = 0; j < arr.length - i - 1; ++j) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
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

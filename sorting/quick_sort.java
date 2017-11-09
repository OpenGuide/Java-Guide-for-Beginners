import java.util.Scanner;
public class quick_sort
{
    /**
    * Quick sorting
    * a divide-based sorting method.
    * You take an element (preferably the last) -- PIVOT,
    * now divide the array into two parts,
    * front part has elements less than or equal to PIVOT
    * rear part has elements grater than PIVOT
    * now use quick sorting on both the parts.
    */
    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i, j; // index of smaller element
        for (i = low - 1, j = low; j < high; ++j) {
            if (arr[j] <= pivot) {
                ++i;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i + 1;
    }
    public static void sorting (int[] arr, int i, int j)
    {
        if (i < j) {
            int p = partition (arr, i, j);
            sorting (arr, i, p - 1);
            sorting (arr, p + 1, j);
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
		sorting(arr, 0, size - 1);
		System.out.println("Sorted array :-");
		for (i = 0; i < size; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

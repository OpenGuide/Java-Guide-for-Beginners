/**
* Program for Linear Searching in JAVA
* return the index of searched element if found,
* else returns -1.
*/
public class linear_searching
{
	public static int search(int[] arr, int val)
	{
		int res;
		for (res = 0; res < arr.length; ++res) {
			if (arr[res] == val) {
				return res;
			}
		}
		return -1;
	}
}

/**
* Program for Binary Searching in JAVA
* return the index of searched element if found,
* else returns -1.
*
* Prerequisite -- Array has to be SORTED.
*/
public class binary_searching
{
	public static int searching(int[] arr, int val)
	{
		int u, l, m;
		for (l = 0, u = arr.length; l <= u; ) {
			m = (l + u) / 2;
			if (arr[m] == val) {
				return m;
			} else if (arr[m] < val) {
				u = m - 1;
			} else {
				l = m + 1;
			}
		}
		return -1;
	}
}

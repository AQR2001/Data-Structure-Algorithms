
public class LinearSearch {
	public int linearSearch(int[] arr, int n, int x) {
		
		
		for(int i=0; i<n; i++) {
			if(arr[i]==x) {
			return i;
			}
		}
		return -1;
	}
	public static void main(String a[]) {
		int[] arr = {1, 5, 3, 6, 7, 10, 9, 4, 2};
		
		LinearSearch ls = new LinearSearch();
		System.out.println(ls.linearSearch(arr, arr.length, 10));
	}
}


public class QuickSort {
	
	public void printArray(int[]arr) {
		int n = arr.length;
		for(int i=0; i<n ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void sort(int[]arr, int low, int high) {
		if(low < high) {
			int p = partition(arr,low,high);
			sort(arr, low, p-1);
			sort(arr, p+1, high);
		}
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low;
		int j = low;
		
		while(i <= high) {
			if(arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
			i++;
		}
		return j-1;
	}
	
	public static void main(String a[]) {
		int[] arr = new int [] {8, -3, 5, 2, 6, 9, -6, 1, 3};
		QuickSort qs = new QuickSort();
		qs.sort(arr, 0, arr.length-1);
		qs.printArray(arr);
		
	}
	

}

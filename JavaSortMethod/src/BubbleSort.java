
public class BubbleSort {

	public void sort(int[] arr) {
		int n = arr.length;
		
		for (int i=0; i < n-1; i++) {
			for (int j=0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		}
	}

	public void sort(String[] unsorted) {
		int n = unsorted.length;
		
		for (int i = 0; i < n-1; i++) {
			for (int j=0; j < n-i-1; j++) {
				if (unsorted[j].compareTo(unsorted[j+1]) > 0) {
					String temp = unsorted[j];
					unsorted[j] = unsorted[j+1];
					unsorted[j+1] = temp;
				}
			}
		}	
	}

	public int countSwap(int[] arr) {
		int n = arr.length;
		int count = 0;
		for (int i=0; i < n-1; i++) {
			for (int j=0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) {
					count++;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
		}
		return count;
	}

}

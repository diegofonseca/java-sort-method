
public class SelectSort 
{
	public void sort(int arr[]) {
		int n = arr.length;
		
		// find the minimum element
		for (int i = 0; i < n-1; i++) {
			int min_idx = i; // 0
			
			for (int j = i + 1; j < n; j++) {				
				if (arr[j] < arr[min_idx]) {
					min_idx = j; 
				}
			}
			// swap the found value
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;				
		}
	}

	public void sort(String[] arr) {
		int n = arr.length;
		
		// find the minimum element
		for (int i = 0; i < n-1; i++) {
			int min_idx = i; // 0
			
			for (int j = i + 1; j < n; j++) {				
				if (arr[j].compareTo(arr[min_idx]) < 0) {
					min_idx = j; 
				}
			}
			// swap the found value
			String temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;				
		}
		
	}
}

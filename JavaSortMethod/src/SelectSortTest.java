import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectSortTest {

	@Test
	public void testSort() {
		int unsorted[] = {64, 25, 12, 22, 11};
		
		SelectSort selectSort = new SelectSort();
		selectSort.sort(unsorted);
		
		int sorted[] = {11,12,22,25,64};
		
		assertArrayEquals(sorted, unsorted);
	}

	@Test
	public void testStringSort() {
		String unsorted[] = {"b","c", "d", "a"};
		
		SelectSort selectSort = new SelectSort();
		selectSort.sort(unsorted);
		
		String sorted[] = {"a","b", "c", "d"};
		
		assertArrayEquals(sorted, unsorted);
	}

}

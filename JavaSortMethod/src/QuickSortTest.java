import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuickSortTest {

	@Test
	void testSort() {
		int unsorted[]	= {34,53,76,12,10,9,8,7,6,5,4,3,2,1};
		int sorted[] 	= {1,2,3,4,5,6,7,8,9,10,12,34,53,76};
		
		QuickSort quickSort = new QuickSort();
		quickSort.sort(unsorted, 0, unsorted.length - 1);
		
		assertArrayEquals(unsorted, sorted);
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeSortTest {

	@Test
	void testSort() {
		int unsorted[]	= {34,53,76,12};
		int sorted[] 	= {12,34,53,76};
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(unsorted, 0, unsorted.length - 1);
		
		assertArrayEquals(unsorted, sorted);
	}

}

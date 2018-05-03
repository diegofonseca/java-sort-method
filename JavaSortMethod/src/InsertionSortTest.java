import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsertionSortTest {

	@Test
	void testInsertionSort() {
		int unsorted[] = {27,1,22,43,16,5};
		int sorted[] = {1, 5, 16, 22, 27, 43};
		InsertionSort insertion = new InsertionSort();
		
		insertion.sort(unsorted);
		
		assertArrayEquals(sorted, unsorted);
		
	}

}

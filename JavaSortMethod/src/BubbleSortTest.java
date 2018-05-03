import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {

	@Test
	public void testIntSort() {
		int unsorted[] = {5, 1, 4, 2, 8};
		int sorted[] = {1,2,4,5,8};		
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(unsorted);
		assertArrayEquals(sorted, unsorted);		
	}
	@Test
	public void testStringSort() {
		String unsorted[] = {"e","a", "c", "d", "b"};
		String sorted[] = {"a","b", "c", "d", "e"};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(unsorted);
		assertArrayEquals(sorted, unsorted);
	}
	@Test
	public void testCountSwap() {
		int arr[] = {8,22,7,9,31,5,13};
		BubbleSort bubbleSort = new BubbleSort();
		assertEquals(10, bubbleSort.countSwap(arr));
	}
	
	/*
	 * Test Driven Development ou em português 
	 * Desenvolvimento dirigido por testes é uma técnica de 
	 * desenvolvimento de software que baseia em um ciclo 
	 * curto de repetições: Primeiramente o desenvolvedor 
	 * escreve um caso de teste automatizado que define 
	 * uma melhoria desejada ou uma nova funcionalidade. 
	 */

}

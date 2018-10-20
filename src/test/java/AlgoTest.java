package test.java;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {
	
	//for expecting null pointer exception
	@Rule
	 public ExpectedException thrown= ExpectedException.none();
	
	/*
	 * Node and Edge Coverage for Bubble Sort
	 */
	@Test
	public void BubbleSortTest() {
		Item[] SortBubble = {new Item(22), new Item(23), new Item(1), new Item(25), new Item(4), new Item(26),
				new Item(27), new Item(29), new Item(28), new Item(100)};
		Item[] SortedBubble = {new Item(1), new Item(4), new Item(22), new Item(23), new Item(25), new Item(26),
				new Item(27), new Item(28), new Item(29), new Item(100)};
		SortAlgos.bubbleSort(SortBubble);
		for(int i=0;i<SortBubble.length;i++) {
			assertEquals("Bubble Sort - node and edge coverage", SortedBubble[i].key, SortBubble[i].key);
		}
	}
	
	// testing null pointer exception by sending null in object array
	@Test
	public void throwsNothing() {
		
	}
	
	/*
	 * Condition Coverage - Bubble Sort
	 */
	@Test
	public void BubbleSortNullTest() {
		thrown.expect(NullPointerException.class);
		Item[] NullObject = null;
		SortAlgos.bubbleSort(NullObject);
	}
	
	
	/*
	 * Node and Edge Coverage for Selection Sort
	 */
	@Test
	public void SelectionSortTest() {
		Item[] SortSelection = {new Item(22), new Item(23), new Item(1), new Item(25), new Item(4), new Item(26),
				new Item(27), new Item(29), new Item(28), new Item(100)};
		Item[] SortedSelection = {new Item(1), new Item(4), new Item(22), new Item(23), new Item(25), new Item(26),
				new Item(27), new Item(28), new Item(29), new Item(100)};
		SortAlgos.selectionSort(SortSelection);
		for (int i = 0; i < SortSelection.length; i++) {
			assertEquals("Selection Sort - node and edge coverage", SortedSelection[i].key, SortSelection[i].key);
		}
	}
	
	/*
	 * Condition Coverage - Selection Sort
	 */
	@Test
	public void SelectionSortNullTest() {
		thrown.expect(NullPointerException.class);
		Item[] NullObject = null;
		SortAlgos.selectionSort(NullObject);
	}
	
	
	/*
	 * Node and Edge Coverage for Quick Sort
	 */
	@Test
	public void QuickSortTest() {
		Item[] SortQuick = {new Item(22), new Item(23), new Item(1), new Item(25), new Item(4), new Item(26),
				new Item(27), new Item(29), new Item(28), new Item(100)};
		Item[] SortedQuick = {new Item(1), new Item(4), new Item(22), new Item(23), new Item(25), new Item(26),
				new Item(27), new Item(28), new Item(29), new Item(100)};
		// Calling function
		SortAlgos.quickSort(SortQuick);
		for (int i = 0; i < SortQuick.length; i++) {
			assertEquals("Quick Sort - node and edge coverage", SortedQuick[i].key, SortQuick[i].key);
		}
	}
	
	/*
	 * Condition Coverage for Quick Sort
	 */
	@Test
	public void QuickSortNullTest() {
		thrown.expect(NullPointerException.class);
		Item[] NullObject = null;
		SortAlgos.quickSort(NullObject);
	}
	
	/*
	 * Node and Edge Coverage for Insertion Sort
	 */
	@Test
	public void InsertionSortTest() {
		Item[] SortInsertion = {new Item(22), new Item(23), new Item(1), new Item(25), new Item(4), new Item(26),
				new Item(27), new Item(29), new Item(28), new Item(100)};
		Item[] SortedInsertion = {new Item(1), new Item(4), new Item(22), new Item(23), new Item(25), new Item(26),
				new Item(27), new Item(28), new Item(29), new Item(100)};
		SortAlgos.insertionSort(SortInsertion);
		for (int i = 0; i < SortInsertion.length; i++) {
			assertEquals("Insertion Sort - node and edge coverage", SortedInsertion[i].key, SortInsertion[i].key);
		}
	}
	
	/*
	 * Condition Coverage for Insertion Sort
	 */
	@Test
	public void InsertionSortNullTest() {
		thrown.expect(NullPointerException.class);
		Item[] NullObject = null;
		SortAlgos.insertionSort(NullObject);
	}
	
	/*
	 * Condition Coverage for Merge Sort
	 */
	@Test
	public void MergeSortNullTest() {
		thrown.expect(NullPointerException.class);
		Item[] NullObject = null;
		SortAlgos.mergeSort(NullObject);
	}
	
	/*
	 * Node and Edge Coverage for Merge Sort
	 */
	@Test
	public void MergeSortTest() {
		Item[] SortMerge = {new Item(22), new Item(23), new Item(1), new Item(25), new Item(4), new Item(26),
				new Item(27), new Item(29), new Item(28), new Item(100)};
		Item[] SortedMerge = {new Item(1), new Item(4), new Item(22), new Item(23), new Item(25), new Item(26),
				new Item(27), new Item(28), new Item(29), new Item(100)};
		
		// Calling function, expecting sorted list in return.
		SortAlgos.mergeSort(SortMerge);
		for (int i = 0; i < SortMerge.length; i++) {
			assertEquals("Merge Sort - node and edge coverage", SortedMerge[i].key, SortMerge[i].key);
		}
		
	}
	
	/*
	 * Node and Edge Coverage for Heap Sort
	 */
	@Test
	public void HeapSortTest() {
		Item[] SortHeap = {new Item(22), new Item(23), new Item(1), new Item(25), new Item(4), new Item(26),
				new Item(27), new Item(29), new Item(28), new Item(100)};
		Item[] SortedHeap = {new Item(1), new Item(4), new Item(22), new Item(23), new Item(25), new Item(26),
				new Item(27), new Item(28), new Item(29), new Item(100)};
		SortAlgos.heapSort(SortHeap);
		for(int i = 0;i < SortHeap.length; i++) {
			assertEquals("Heap Sort - node and edge coverage", SortedHeap[i].key, SortHeap[i].key);
		}
	}
}
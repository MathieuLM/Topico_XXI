/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

/** Class representing the implementation of a priority queue
 *	using a linked list sorted by increasing key
 */

class SortedList extends PriorityQueue {
	/** Internal class, describing a single element of the Queue
	 */
	private class SortedCell {
		//couple (key, data) in the cell
		private KeyData couple;
		//pointer to the next element in the queue
		private SortedCell next;

		//...
		//...
	}

	//head of the queue
	private SortedCell head;
	//array of references to each cell
	//...


	/** Insert the couple (key, data) into the queue
	 */
	public void insert(KeyData couple) {
		return;
	};

	/** Returns the couple (key, data) present in the queue
	 *	that has the lowest key
	 */
	public KeyData getMin() {
		return new KeyData();
	};

	/** Returns the couple (key, data) present in the queue
	 *	that has the lowest key, and removes it from the queue
	 */
	public KeyData deleteMin() {
		return new KeyData();
	};

	/** Replaces the value of the couple by the new one
	 *	then return the updated couple
	 */
	public KeyData update(KeyData oldCouple, KeyData newCouple) {
		return new KeyData();
	};
};

/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

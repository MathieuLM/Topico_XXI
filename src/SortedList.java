/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

/** Class representing the implementation of a priority queue
 *	using a linked list sorted by increasing key
 */

class SortedList extends PriorityQueue {
	/** Internal class, describing a single element of the Queue
	 */
	class SortedCell {
		//couple (key, data) in the cell
		private KeyData couple;
		//pointer to the next element in the queue
		private SortedCell next;
		
		public SortedCell(KeyData couple) {
			setCouple(couple);
			setNext(null);
		}
		
		public KeyData getCouple() { return couple; }
		public void setCouple(KeyData couple) { this.couple = couple; }
		public SortedCell getNext() { return next; }
		public void setNext(SortedCell next) {this.next = next; }
	}

	//head of the queue
	private SortedCell head;
	//array of references to each cell
	//...

	public SortedList() {
		this.head = null;
	}

	/** Insert the couple (key, data) into the queue
	 */
	public void insert(KeyData couple) {
		SortedCell newCell = new SortedCell(couple);
		newCell.setNext(this.head);
		this.head = newCell;
		return;
	};

	/** Returns the couple (key, data) present in the queue
	 *	that has the lowest key
	 */
	public KeyData getMin() {
		return this.head.getCouple();
	};

	/** Returns the couple (key, data) present in the queue
	 *	that has the lowest key, and removes it from the queue
	 */
	public KeyData deleteMin() {
		SortedCell trash = this.head;
		this.head = this.head.getNext();
		return trash.getCouple();
	};

	/** Replaces the value of the couple by the new one
	 *	then return the updated couple
	 */
	public KeyData update(KeyData oldCouple, KeyData newCouple) {
		return new KeyData();
	};
};

/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

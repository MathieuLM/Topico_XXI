/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

/** Class representing the implementation of a priority queue
 *	using a binary tree where the father's key is inferior or equal
 *	to its children's key *
 */

class Heap extends PriorityQueue {
	/** Internal class, describing a node of the Tree
	 */
	private class HeapNode {
		//couple (key, data) in the cell
		private KeyData couple;
		//pointer to the left son
		private HeapNode left;
		//pointer to the right son
		private HeapNode right;

		//...
		//...
	}

	//root of the tree
	private HeapNode root;
	//array of references to each node
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

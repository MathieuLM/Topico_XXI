/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

/** Class representing the implementation of a priority queue
 *	using an array of the data adressed by its key
 */

class Array extends PriorityQueue {

	//the array 
	//...
	//pointer to the minimum
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

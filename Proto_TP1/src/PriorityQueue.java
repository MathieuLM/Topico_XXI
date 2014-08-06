/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

/** Abstract class representing a general priority queue
 *	All the methods will be implemented in each subclass.
 */

abstract class PriorityQueue {
	/** Insert the couple (key, data) into the queue
	 */
	abstract void insert(KeyData couple);

	/** Returns the couple (key, data) present in the queue
	 *	that has the lowest key
	 */
	abstract KeyData getMin();

	/** Returns the couple (key, data) present in the queue
	 *	that has the lowest key, and removes it from the queue
	 */
	abstract KeyData deleteMin();

	/** Replaces the value of the couple by the new one
	 *	then return the updated couple
	 */
	abstract KeyData update(KeyData oldCouple, KeyData newCouple);
}

/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

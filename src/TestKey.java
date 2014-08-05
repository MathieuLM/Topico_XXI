/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

class TestKey {
	public static void main(String[] args) {
		Key testKey = new Key();
		assert testKey.get() == 0;
		testKey.set(2);
		assert testKey.get() == 2;
		assert testKey.get() != 0;

		System.out.print("\nTest successfull.\n");
	}
}

/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

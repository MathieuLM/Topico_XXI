/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

class KeyData {
	private Key key;
	private Data data;

	public KeyData() { 
		this.key = new Key();
		this.data = new Data();
	}

	public KeyData(Key key, Data data) { 
		this.key = key;
		this.data = data;
	}

	public void set(Key key, Data data) { 
		this.key = key;
		this.data = data;
	}
	public KeyData get() { 
		return this;
	}
}

/* Written by Mathieu Liénard--Mayor, UFRGS, 2014-2 */

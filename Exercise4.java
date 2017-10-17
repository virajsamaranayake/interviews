package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

Add Syncronise keywords on Methods increment and getCount

*/
public class Exercise4 {

	public static class Counter {
		
		private int count = 0;
		
		public synchronized int increment() {
			return ++count;
		}
		
		public synchronized int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}
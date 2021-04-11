package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Searching {

	public static void main(String[] args) {

		String[] strings = {"0", "1", "2", "3", "129", "130"};

		// Translate String array into List of Integer
		List<Integer> integers = new ArrayList<Integer>();
		for (String s : strings) {
			integers.add(Integer.valueOf(s));
		}

		System.out.println(Collections.binarySearch(integers, 1, cmp) + "	, "
				+ Collections.binarySearch(integers, 130, cmp));
	}

	static Comparator<Integer> cmp = new Comparator<Integer>() {

		public int compare(Integer o1, Integer o2) {
			return o1 < o2 ? -1 : (o1 == o2 ? 0 : 1);
		}
	};
	
//	// Possible solution 1
//	static Comparator<Integer> cmp = new Comparator<Integer>() {
//
//		public int compare(Integer o1, Integer o2) {
//			return o1 < o2 ? -1 : (o1 > o2 ? 1 : 0);
//		}
//	};
	
//	// Possible solution 2
//	static Comparator<Integer> cmp = new Comparator<Integer>() {
//
//		public int compare(Integer o1, Integer o2) {
//			return o1 < o2 ? -1 : (o1.equals(o2) ? 0 : 1);
//		}
//	};
	
//	// Possible solution 3 (better)
//	static Comparator<Integer> cmp = new Comparator<Integer>() {
//
//		public int compare(Integer o1Boxed, Integer o2Boxed) {
//			// Unbox arguments to force value comparison
//			int o1 = o1Boxed;
//			int o2 = o2Boxed;
//			
//			return o1 < o2 ? -1 : (o1 == o2 ? 0 : 1);
//		}
//	};
}
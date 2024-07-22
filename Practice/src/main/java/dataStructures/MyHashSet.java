/**
 - Insertion order is not preserved
 - Objects are not stored in sequence
 - Indexing can't be used with Hash set
 - duplicates are not allowed
 */
package dataStructures;

import java.util.HashSet;

public class MyHashSet {

	public static void main(String[] args) {
		HashSet<Object> hashSet1 = new HashSet<Object>();
		hashSet1.add(76);
		hashSet1.add("abc");
		hashSet1.add(76.6);
		hashSet1.add(null);
		hashSet1.add("abcd");
		hashSet1.add(54.6);
		hashSet1.add(287);
		hashSet1.add(null);
		hashSet1.add("abcd");
		hashSet1.add(54.6);
		hashSet1.add(287);
		System.out.println(hashSet1);
		
		for(Object element : hashSet1) {
			System.out.println(element);
		}
		
		
		
	

	}

}

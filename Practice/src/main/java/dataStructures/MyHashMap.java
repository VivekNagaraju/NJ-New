package dataStructures;

import java.util.HashMap;

public class MyHashMap {

	public static void main(String[] args) {
		HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
		hashMap1.put(1, "abc");
		hashMap1.put(2, "ahgf");
		System.out.println(hashMap1);
		hashMap1.put(1, "abchb");
		System.out.println(hashMap1);
		hashMap1.put(3, "abchb");
		System.out.println(hashMap1);

	}

}

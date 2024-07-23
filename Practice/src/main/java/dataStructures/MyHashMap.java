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
		System.out.println(hashMap1.get(3));
		System.out.println(hashMap1.get(4));
		System.out.println(hashMap1.keySet());
		System.out.println(hashMap1.values());

	}

}

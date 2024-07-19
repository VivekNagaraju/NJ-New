/**
 ArrayList: Resizable-array implementation of the List interface.
 
 -> An empty arrayList can be created
 -> ArrayList holds null values
 -> Objects/ elements are stored in a sequence; insertion order is preserved 
 
 */
package dataStructures;

import java.util.ArrayList;
import java.util.Iterator;


public class MyArrayList {

	public static void main(String[] args) {
		// ArrayList<DataType Wrapper Class> objectName = new ArrayList<DataType Wrapper Class>();
		
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		System.out.println(arrayList1);
		arrayList1.add(null);
		arrayList1.add(null);
		System.out.println(arrayList1);
		arrayList1.add(5);
		arrayList1.add(3);
		arrayList1.add(4);
		arrayList1.add(6);
		arrayList1.add(8);
		arrayList1.add(8);
//		arrayList1.add("abc");
		System.out.println(arrayList1);
//		System.out.println(arrayList1.get(0));
//		System.out.println(arrayList1.get(1));
//		System.out.println("Negative index"+arrayList1.get(-1)); // Negative index is not supported
//		System.out.println(arrayList1.indexOf(6));
//		System.out.println(arrayList1.indexOf(8));
//		System.out.println(arrayList1.indexOf(1)); // return -1 because element is not present in the list
		
		System.out.println("=====Basic for loop=====");
		for(int i=0; i<arrayList1.size(); i++) {
			System.out.println(arrayList1.get(i));
		}
		
		System.out.println("=====Advanced for loop=====");
		for(Integer arrayElement : arrayList1) {
			System.out.println(arrayElement);
		}
		
		System.out.println("=====Iterator=====");
		System.out.println(arrayList1);
		Iterator<Integer> arrayIterator= arrayList1.iterator();
		while(arrayIterator.hasNext()) {
			
			Integer arrayObject=arrayIterator.next();
			System.out.println(arrayObject);
			
			if(arrayObject== (Integer)4) {
				arrayIterator.remove();
			}
		}
		System.out.println(arrayList1);
		
		System.out.println("====Heterogeneous Array List");
		
		ArrayList<Object> arrayList2 = new ArrayList<Object>();
		arrayList2.add(4);
		arrayList2.add(null);
		arrayList2.add("abc");
		System.out.println(arrayList2);

	}
	



}

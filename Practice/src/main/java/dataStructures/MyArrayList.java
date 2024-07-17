/**
 ArrayList: Resizable-array implementation of the List interface.
 
 -> An empty arrayList can be created
 -> ArrayList holds null values
 -> Objects/ elements are stored in a sequence; insertion order is preserved 
 
 */
package dataStructures;

import java.util.ArrayList;


public class MyArrayList {

	public static void main(String[] args) {
		// ArrayList<DataType Wrapper Class> objectName = new ArrayList<DataType Wrapper Class>();
		
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		System.out.println(arrayList1);
		arrayList1.add(null);
		System.out.println(arrayList1);
		arrayList1.add(5);
//		arrayList1.add(3);
//		arrayList1.add(4);
//		arrayList1.add(6);
//		arrayList1.add(8);
		System.out.println(arrayList1);
		System.out.println(arrayList1.get(0));
		System.out.println(arrayList1.get(1));
//		System.out.println("Negative index"+arrayList1.get(-1)); // Negative index is not supported
//		System.out.println(arrayList1.indexOf(6));
//		System.out.println(arrayList1.indexOf(8));
		System.out.println(arrayList1.indexOf(1)); // return -1 because element is not present in the list
		
		
		

	}

}

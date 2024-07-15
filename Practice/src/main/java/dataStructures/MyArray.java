/**
 Arrays: Group of homogeneous(same data type) data elements with a common name
 - size of an array is fixed. It can't be altered once declared (static)
 - Accessing elements from an array
 	a. Indices
 	b. for-each loop/ advanced for loop 
 
 Syntax:
 
 1. Array creation with values
 	dataType name[] = {values separated by commas}
 
 2. Array creation without values
 	dataType name[];
 
 */
package dataStructures;

public class MyArray {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5, 6};
		int secondIntArray[]= new int[5];
		secondIntArray[0]=99;
		secondIntArray[1]=3;
		secondIntArray[2]=65;
		secondIntArray[3]=76;
		secondIntArray[4]=54;
		System.out.println(intArray[0]);
		

	}

}

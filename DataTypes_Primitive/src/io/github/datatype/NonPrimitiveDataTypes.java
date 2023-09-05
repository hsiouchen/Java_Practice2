package io.github.datatype;

public class NonPrimitiveDataTypes {

	// String
	// Array

	public static void main(String[] args) {

		String str1 = "This is a Non Primitive Data Types";
		System.out.println("String is : " + str1);

		// new Object
		String str2 = new String("This is a String Object");
		System.out.println("String is : " + str2);

		// ============================================

		// declares an array of integers
		int[] anArray;

		// allocates memory for 10 integers
		anArray = new int[10];

		// initialize first element
		anArray[0] = 100;
		// initialize second element
		anArray[1] = 200;
		// and so forth
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;

		System.out.println();
		System.out.println(anArray);
		System.out.println();
		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 8: " + anArray[8]);
		System.out.println("Element at index 9: " + anArray[9]);
		
		
		System.out.println("Element at index 10: " + anArray[10]);
		/*
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
					at DataTypes_Primitive/io.github.datatype.NonPrimitiveDataTypes.main(NonPrimitiveDataTypes.java:47)
		 */

	}
}

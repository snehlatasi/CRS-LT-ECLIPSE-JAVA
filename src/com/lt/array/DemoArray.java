package com.lt.array;

public class DemoArray {

	public static void main(String[] args) {
		// data type array
		int arrayofInt[] = new int[] {1,2,3};
		for(int i=0; i<arrayofInt.length; i++){
			System.out.println("The" + i + "element has value   : " + arrayofInt[i]);
		}
		
		// wraper class array
		String name[] = new String[] {"Shakhi","Sneha", "rahul"};
		for(int i=0; i<name.length; i++){
			System.out.println("The " + i + " name is " + name[i]);
		}
         // Custom array
		
	}

}

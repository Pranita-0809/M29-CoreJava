package org.tnsif.exceptiondemo;

public class Finallyblcokeg {

	public static void main(String[] args) {
		//array declaration and initialization
int arr[]=new int[] {101,2,37};
 System.out.println("Array is:");
 try {
	// System.exit(0);
 System.out.println(arr[3]);
 }
 catch(Exception e)
 {
	 System.out.println("exception handled"+e); 
 }
finally
{
	 System.out.println(4/0); 
	 System.out.println("finally executed"); 
}


	}

}

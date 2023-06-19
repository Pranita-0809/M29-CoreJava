package org.tnsif.exceptiondemo;
public class Multiplecatchdemo {
	public static void main(String[] args) {
		//array declaration and initialization
int arr[]=new int[] {101,2,37};
 System.out.println("Array is:");
 try {
 System.out.println(arr[3]);
 }
// catch(ArrayIndexOutOfBoundsException e)
// {
//	 System.out.println("exception handled"+e); 
 //}
// catch(ArithmeticException e)
// {
//	 System.out.println("exception handled"+e); 
 //}
 catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
 {
	 System.out.println("exception handled"+e); 
 }
	}}

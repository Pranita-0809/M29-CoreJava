package org.tnsif.exceptiondemo;
import java.util.Scanner;
public class Nestedtrycatch
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of x and y");
		int x=s.nextInt();
		int y=s.nextInt();
		int arr[]=new int[] {101,2,37};
		try
		{
			try
			{
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		 {
		 System.out.println("exception handled"+e); 
		 }
			try
			{
				System.out.println(x/y);
			}
		 catch(ArithmeticException e)
		 {
		 System.out.println("exception handled"+e); 
		 }
		}
finally
{
	System.out.println("Finaly block");
}
		}}

		

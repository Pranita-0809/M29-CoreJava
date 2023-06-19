package org.tnsif.generics;

class GenericMethod
{
	public <E> void print(E[] arr1)
	{
		for(E itr:arr1)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
	}
}
public class GenericMethodEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethod g= new GenericMethod();
		Integer[] arr1= {11,66,55};
		Character[] arr2= {'f','k','b'};
		System.out.print("integer array:");
		g.print(arr1);
		System.out.print("character array:");
		g.print(arr2);
	
	}

}

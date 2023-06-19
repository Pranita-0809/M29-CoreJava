package org.tnsif.arrays;
import java.util.Scanner;
public class Jaggedarray {

	public static void main(String[] args) {
int arr[][]=new int[2][];
Scanner s=new Scanner(System.in);
//making above array jagged
//first row has three column
arr[0]=new int[3];
//second row has two column
arr[1]=new int[2];
//initialize
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		arr[i][j]=s.nextInt();
	}
	
}
System.out.println("content of 2d jagged array");
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.println(arr[i][j]+" ");


}
}
}}
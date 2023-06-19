package org.tnsif.exceptiondemo;
import java.util.Scanner;
public class ArithmethicExceptionEg {

	public static void main(String[] args) {
		try
		{
int a,b,c;
a=args.length;
b=10/a;
System.out.println(a);
}
catch (ArithmeticException e)
{
System.out.println("int");		
}
	}
}

package org.tnsif.exceptiondemo;
import java.io.IOException;
public class ThrowKeywordExample {
public static void donate(int age,int weight) throws IOException
{
	if(age>18 && weight>50)
		System.out.println("Person is eligible");
	else
		throw new IOException("Person is not eligible");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	ThrowKeywordExample.donate(17,45);
}
catch(IOException e){
	System.out.println("except handling");
}

	}
}


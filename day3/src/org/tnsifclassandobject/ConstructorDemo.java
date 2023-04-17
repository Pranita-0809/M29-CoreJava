package org.tnsifclassandobject;
import java.util.Scanner;
public class ConstructorDemo {
	public static void main (String [] args) {
		Scanner s=new Scanner(System.in);
		int id;
		String name;
		System.out.println("enter customer id");
	id=s.nextInt();
	s.nextLine();
	System.out.println("enter customer name");
	}
	name=s.nextLine();
	customer c=new customer();
	c.setCustomerid(id);
	c.setCustomername(name);
	System.out.println(c);
	

	

}

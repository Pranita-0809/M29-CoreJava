package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList("Pranita","Jagdish","himanshu");
   obj.stream().filter((i->i.length()>7)).forEach((i)->System.out.print(i+" "));
   System.out.println();
    
   obj.stream().distinct().forEach((i)->System.out.print(i+" "));
   System.out.println();

   obj.stream().limit(2).forEach((i)->System.out.print(i+" "));
   System.out.println();

   obj.stream().skip(1).forEach((i)->System.out.print(i+" "));

	}

}

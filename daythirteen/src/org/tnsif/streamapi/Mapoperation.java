package org.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;


public class Mapoperation {

	public static void main(String[] args) {
		// demonstrate map operation
		List<String>obj=Arrays.asList("Pranita","Jagdish","himanshu");
		obj.stream().map(i->i.length()).forEach((i)->System.out.print(i+" "));

	}

}

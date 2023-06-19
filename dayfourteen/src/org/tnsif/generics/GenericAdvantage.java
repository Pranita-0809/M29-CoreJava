package org.tnsif.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericAdvantage {

	public static void main(String[] args) {
		// Type Safety
List<Integer> list=new ArrayList();
list.add(11);
//list.add(23.7);
System.out.println(list);
//before Generics,Typecasting allowed
ArrayList arr1=new ArrayList();
arr1.add("St john");
System.out.println(arr1);
String str=(String)arr1.get(0);
System.out.println(str);

//after Generics,Typecasting is not necessary
ArrayList<String> arr2=new ArrayList<>();
arr2.add("St john");
System.out.println(arr2);
String str1=arr2.get(0);
System.out.println(str1);

	}

}

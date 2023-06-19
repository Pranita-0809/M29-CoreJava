package org.tnsif.generics;

 class GenericClasseg1<T> {
T x;
void print(T x)
{
	this.x=x;
}
T accept()
{
	return x;
}
}
public class GenericClasseg
{

	public static void main(String[] args) {
GenericClasseg1<String>obj= new GenericClasseg1<>();
obj.print("d");
System.out.println(obj.accept());
	}

}

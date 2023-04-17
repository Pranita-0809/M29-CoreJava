package org.tnsif.firstpackage;

public class base {
int  a=4;
public String b="John";
private int c=888;
protected float sal=1.67f;

void methoddefault()
{
	System.out.println("default access modifier"+a);
	}
public void methodpublic()
{
	System.out.println("public access modifier"+b);
	}
void methodprivate()
{
	System.out.println("private access modifier"+c);
	}
void methodprotected()
{
	System.out.println("protected access modifier"+sal);
}
}


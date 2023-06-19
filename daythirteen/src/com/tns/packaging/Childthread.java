package com.tns.packaging;

public class Childthread extends Thread {
Person p;
public ChildThread(Person p)
{
	this.p=p;
	start();
}
public void run()
{
	System.out.println();
}
}

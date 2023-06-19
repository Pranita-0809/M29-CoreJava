package objectclassexample;
class Sample
{}

class Demo{
	Demo()
	//resource allocated
	{
		System.out.println("inside constructor");
	}
protected void finalize()
{
	System.out.println("finalize method");
}}
public class Objectclassexample {

	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		Demo d=new Demo();
				System.out.println(d.getClass());
		System.out.println(d.hashCode());
Object obj=new Object();
System.out.println(obj.getClass());

	}
	}



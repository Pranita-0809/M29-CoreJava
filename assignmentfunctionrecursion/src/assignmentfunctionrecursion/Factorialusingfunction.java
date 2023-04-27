package assignmentfunctionrecursion;
import java.util.Scanner;
public class Factorialusingfunction {
	static int factorial(int num)
	{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=i*fact;
	}
return fact;
		}
	public static void main(String[] args) {
		System.out.println("enter no");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("factorial of "+num+ "is "+factorial(num));
		s.close();
		// TODO Auto-generated method stub

	}

}

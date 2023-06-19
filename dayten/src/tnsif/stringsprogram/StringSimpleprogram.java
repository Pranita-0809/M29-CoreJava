package tnsif.stringsprogram;

public class StringSimpleprogram {

	public static void main(String[] args) {
		String str1="pranita";
		System.out.println("using new keyword");
		String str2= new String("pranita");
		System.out.println("using new keyword"+str2);
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		String str3="pranita";
		System.out.println(str1==str3);

	}

}

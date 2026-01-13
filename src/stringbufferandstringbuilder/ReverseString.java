package stringbufferandstringbuilder;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String a = s.nextLine();
	StringBuilder x = new StringBuilder(a);
	System.out.println("Reverse of "+a+" is: "+x.reverse());
	
	}

}

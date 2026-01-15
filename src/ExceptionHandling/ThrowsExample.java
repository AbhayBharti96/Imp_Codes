package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * Exception that are not checked by the compiler are called 
 * Unchecked Exception
 * To do the checked Exception we can do by using Throws in the Method
 */
public class ThrowsExample {

	public static void main(String[] args) throws Exception{
		Method2();
		System.out.println("Hello");
	}
	public static void Method2() throws Exception{
		Method1();
	}
	
	public static void Method1() throws Exception {
		FileReader f = new FileReader("a.txt");
	}
	
	}



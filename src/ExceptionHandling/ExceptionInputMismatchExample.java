package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class A {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
// Always remeber that the parents should not be come first
// Use ExceptionsName not Class Exception if we want to catch 
//Multiple exception..
public class ExceptionInputMismatchExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			int a = s.nextInt();
			A ab = null;
			ab.setId(123);
			System.out.println(ab.getId());
		} catch (InputMismatchException e) {
			System.out.println(e);
		} catch (Exception e2) {
			System.out.println(e2);
		}

	}

}

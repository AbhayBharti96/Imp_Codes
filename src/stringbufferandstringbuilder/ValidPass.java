package stringbufferandstringbuilder;

import java.util.Scanner;

public class ValidPass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String password = s.nextLine();
		String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$";

		if (password.matches(pattern)) {
		    System.out.println("Valid password");
		} else {
		    System.out.println("Invalid password");
		}

	}

}

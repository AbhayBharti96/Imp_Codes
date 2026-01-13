package stringbufferandstringbuilder;

/*
 * ^[A-Za-z0-9+_.-]+ → local part: letters, digits, +, _, ., -, at least 1 character

@ → must contain exactly one @

[A-Za-z0-9.-]+ → domain part: letters, digits, dots, hyphens, at least 1 character

$ → end of string
 */


public class ValidEmail {

	public static void main(String[] args) {
		String email = "user.name@example.com";

		// Simple email pattern
		String pattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

		if (email.matches(pattern)) {
		    System.out.println("Valid email");
		} else {
		    System.out.println("Invalid email");
		}

	}

}
// ------------------OR------------------
/*package stringbufferandstringbuilder;

import java.util.Scanner;

public class EmailValidator {

    // Method to validate email
    public static boolean isValidEmail(String email) {
        // Rule 1: No spaces allowed
        if (email.contains(" ")) {
            System.out.println("Invalid: Email should not contain spaces.");
            return false;
        }

        // Rule 2: Must contain exactly one '@'
        int atCount = email.length() - email.replace("@", "").length();
        if (atCount != 1) {
            System.out.println("Invalid: Email must contain exactly one '@' symbol.");
            return false;
        }

        // Split local and domain part
        String[] parts = email.split("@");
        String local = parts[0];
        String domain = parts[1];

        // Rule 3: Local part must not be empty and no consecutive dots
        if (local.isEmpty()) {
            System.out.println("Invalid: Local part before '@' is empty.");
            return false;
        }
        if (local.startsWith(".") || local.endsWith(".")) {
            System.out.println("Invalid: Local part cannot start or end with a dot.");
            return false;
        }
        if (local.contains("..")) {
            System.out.println("Invalid: Local part cannot have consecutive dots.");
            return false;
        }

        // Rule 4: Domain part must not be empty and must contain at least one dot
        if (domain.isEmpty()) {
            System.out.println("Invalid: Domain part after '@' is empty.");
            return false;
        }
        if (!domain.contains(".")) {
            System.out.println("Invalid: Domain must contain at least one '.'");
            return false;
        }

        // Rule 5: TLD validation (last part after last dot, 2-6 letters)
        String tld = domain.substring(domain.lastIndexOf(".") + 1);
        if (tld.length() < 2 || tld.length() > 6) {
            System.out.println("Invalid: Top-level domain (TLD) must be 2 to 6 letters.");
            return false;
        }

        // Rule 6: Allowed characters check using regex
        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!email.matches(emailPattern)) {
            System.out.println("Invalid: Email contains invalid characters.");
            return false;
        }

        // All checks passed
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email to validate: ");
        String email = sc.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid email!");
        }

        sc.close();
    }
}

 */


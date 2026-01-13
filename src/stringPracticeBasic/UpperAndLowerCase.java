package stringPracticeBasic;

import java.util.Scanner;

public class UpperAndLowerCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter the String x -> ");
        String x = s.nextLine().trim().toLowerCase();
        System.out.print("Enter the String y -> ");
        String  y = s.nextLine().trim().toUpperCase();
        System.out.println(x+ " in UpperCase is: "+x.toUpperCase());
        System.out.println(y+ " in LowerCase is: "+y.toLowerCase());
	}

}

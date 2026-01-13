package stringPracticeBasic;

import java.util.Scanner;

public class PallindromeCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String -> ");
		String x = s.nextLine();
		StringBuilder sb = new StringBuilder(x);
		String y =sb.reverse().toString();
		if(x.equals(y)) {
			System.out.println(x+" is Pallindrome");
		}else {
			System.out.println(x+" is not Pallindrome");
		}
	}

}

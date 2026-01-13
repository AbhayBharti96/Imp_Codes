package stringPracticeBasic;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String -> ");
		String x = s.nextLine();
		String y ="";
		for(int i=x.length()-1;i>=0;i--) {
			y += x.charAt(i);
		}
		System.out.println("Reversed String is -> "+y);
	}

}

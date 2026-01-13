package stringPracticeBasic;

import java.util.Scanner;

public class LenghtOfString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String -> ");
		String x = s.nextLine();
		int c = 0;
		for(char ch :x.toCharArray()) {
			c++;
		}
		System.out.println("Length of String is -> "+c);
	}

}

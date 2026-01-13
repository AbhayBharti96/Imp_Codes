package stringPracticeBasic;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter the String -> ");
        String x = s.nextLine();
        x = x.trim().replaceAll("\\s","");
        System.out.println("Clean String is -> "+x);
	}

}

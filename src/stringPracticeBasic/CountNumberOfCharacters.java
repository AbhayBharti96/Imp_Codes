package stringPracticeBasic;

import java.util.Scanner;

public class CountNumberOfCharacters {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String -> ");
        String x = s.nextLine();

        int count = 0;

        for (char ch : x.toCharArray()) {
            count++;
        }

        System.out.println("Number of characters are: " + count);

        s.close();
    }
}

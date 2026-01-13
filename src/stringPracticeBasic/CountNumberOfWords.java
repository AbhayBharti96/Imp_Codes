package stringPracticeBasic;

import java.util.Scanner;

public class CountNumberOfWords {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String -> ");
        String x = s.nextLine().trim();

        if (x.isEmpty()) {
            System.out.println("Number of Words in String are -> 0");
        } else {
            String[] arr = x.split("\\s+");
            System.out.println("Number of Words in String are -> " + arr.length);
        }

        s.close();
    }
}

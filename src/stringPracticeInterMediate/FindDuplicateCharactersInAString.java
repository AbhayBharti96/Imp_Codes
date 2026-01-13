package stringPracticeInterMediate;

import java.util.Scanner;

public class FindDuplicateCharactersInAString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String -> ");
        String x = s.nextLine();

        char[] arr = x.toCharArray();

        System.out.println("Duplicate characters are:");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ')
                continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0'; // mark as visited
                }
            }

            if (count > 1 && arr[i] != '0') {
                System.out.println(arr[i] + " -> " + count);
            }
        }

        s.close();
    }
}

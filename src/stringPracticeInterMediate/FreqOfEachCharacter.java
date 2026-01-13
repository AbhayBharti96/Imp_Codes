package stringPracticeInterMediate;

import java.util.Scanner;

public class FreqOfEachCharacter {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the String -> ");
        String str = s.nextLine();

        char[] arr = str.toCharArray();

        System.out.println("Character Frequency:");

        for (int i = 0; i < arr.length; i++) {

            // Skip spaces and already visited characters
            if (arr[i] == ' ' || arr[i] == '0') {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0'; // mark as visited
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }

        s.close();
    }
}

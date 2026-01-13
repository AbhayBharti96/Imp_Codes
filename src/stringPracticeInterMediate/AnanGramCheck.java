package stringPracticeInterMediate;

import java.util.Arrays;

public class AnanGramCheck {

    public static void main(String[] args) {

        String a = "abhay";
        String b = "bhaya";

        // Step 1: Check length
        if (a.length() != b.length()) {
            System.out.println("Is Anagram -> false");
            return;
        }

        // Step 2: Convert to char array
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare characters
        boolean isAnagram = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram = false;
                break;
            }
        }

        // Step 5: Print result
        System.out.println("Is Anagram -> " + isAnagram);
    }
}

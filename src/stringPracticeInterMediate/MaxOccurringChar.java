package stringPracticeInterMediate;

class MaxOccurringChar {

    public static void main(String[] args) {

        String str = "programmming";
        char maxChar = str.charAt(0);
        int maxCount = 0;

        // Outer loop: go through each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Inner loop: count occurrences of this character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            // Update maxCount and maxChar if needed
            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
        }

        System.out.println("Max occurring character: " + maxChar);
    }
}

package stringbufferandstringbuilder;

public class RepeatedWords {

    public static void main(String[] args) {

        String paragraph = "Java is fun. Java is easy to learn. Programming in Java is interesting.";

        // Step 1: Remove punctuation and split into words
        String[] words = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        boolean[] counted = new boolean[words.length]; // keep track of already counted words

        System.out.println("Repeated words in the paragraph:");

        // Step 2: Compare each word with all other words
        for (int i = 0; i < words.length; i++) {
            if (counted[i]) continue; // skip if already counted

            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    counted[j] = true; // mark duplicate as counted
                }
            }

            if (count > 1) {
                System.out.println(words[i] + " -> " + count + " times");
            }
        }
    }
}

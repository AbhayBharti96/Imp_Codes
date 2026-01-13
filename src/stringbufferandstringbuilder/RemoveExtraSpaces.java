package stringbufferandstringbuilder;

public class RemoveExtraSpaces {

    public static void main(String[] args) {

        String sentence = "   Java    is   fun   to   learn   ";

        // Step 1: Remove leading and trailing spaces
        sentence = sentence.trim();

        // Step 2: Replace multiple spaces between words with a single space
        sentence = sentence.replaceAll("\\s+", " ");

        System.out.println("After removing extra spaces: '" + sentence + "'");
    }
}

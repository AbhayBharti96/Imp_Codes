package stringbufferandstringbuilder;

public class StringVsStringBuilder {

    public static void main(String[] args) {

        // Using String
        String str = "Hello";
        System.out.println("Original String: " + str);

        str.concat(" World"); // trying to modify
        System.out.println("After concat without assignment: " + str);

        str = str.concat(" World"); // assign the result
        System.out.println("After concat with assignment: " + str);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sb);

        sb.append(" World"); // modifies the same object
        System.out.println("After append: " + sb);

    }
}

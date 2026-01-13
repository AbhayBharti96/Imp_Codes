package stringbufferandstringbuilder;

public class AppendMultipleStrings {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        sb.append(" How are you?");

        System.out.println(sb.toString());
    }
}

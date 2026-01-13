package stringbufferandstringbuilder;

public class InsertDeleteExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("HelloWorld");

        // ===== Insert =====
        sb.insert(5, " ");  // insert space at index 5
        System.out.println("After insert: " + sb);

        sb.insert(0, "Say "); // insert at beginning
        System.out.println("After insert at start: " + sb);

        // ===== Delete =====
        sb.delete(0, 4);  // delete from index 0 to 3 (end index is exclusive)
        System.out.println("After delete: " + sb);

        sb.deleteCharAt(5); // delete character at index 5
        System.out.println("After deleteCharAt: " + sb);
    }
}

package stringbufferandstringbuilder;

public class ComParePerfomance {

    public static void main(String[] args) {

        int n = 100000; // number of concatenations

        // ===== Using String =====
        long startTime = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + " ms");

        // ===== Using StringBuilder =====
        startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }

        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");
    }
}

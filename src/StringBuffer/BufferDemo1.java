package StringBuffer;

/*
 * Properties Of StringBuffer
 * --------------------------
 * Mutable (can be changed)
 * Thread-safe (synchronized)
 * Slower than StringBuilder
 * Package: java.lang
 */

public class BufferDemo1 {

    public static void main(String[] args) {

        System.out.println("STRINGBUFFER DEMONSTRATION\n");

        // 1. Creating StringBuffer
        System.out.println("1. Creating StringBuffer");
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial value: " + sb);
        System.out.println();

        // 2. append()
        System.out.println("2. append() method");
        sb.append("World");
        System.out.println("After append: " + sb);
        System.out.println();

        // 3. insert()
        System.out.println("3. insert() method");
        sb.insert(10, "Java");
        System.out.println("After insert: " + sb);
        System.out.println();

        // 4. replace()
        System.out.println("4. replace() method");
        sb.replace(0, 5, "Lelo");
        System.out.println("After replace: " + sb);
        System.out.println();

        // 5. delete()
        System.out.println("5. delete() method");
        sb.delete(0, 4);
        System.out.println("After delete: " + sb);
        System.out.println();

        // 6. deleteCharAt()
        System.out.println("6. deleteCharAt() method");
        sb.deleteCharAt(2);
        System.out.println("After deleteCharAt: " + sb);
        System.out.println();

        // 7. reverse()
        System.out.println("7. reverse() method");
        sb.reverse();
        System.out.println("After reverse: " + sb);
        System.out.println();

        // 8. capacity()
        System.out.println("8. capacity() method");
        System.out.println("Capacity: " + sb.capacity());
        System.out.println();

        // 9. length()
        System.out.println("9. length() method");
        System.out.println("Length: " + sb.length());
        System.out.println();

        // 10. charAt()
        System.out.println("10. charAt() method");
        System.out.println("Character at index 0: " + sb.charAt(0));
        System.out.println();

        // 11. setCharAt()
        System.out.println("11. setCharAt() method");
        sb.setCharAt(0, 'H');
        System.out.println("After setCharAt: " + sb);
        System.out.println();

        // 12. substring()
        System.out.println("12. substring() method");
        String s = sb.substring(0, 5);
        System.out.println("Substring: " + s);
        System.out.println();

        // 13. indexOf()
        System.out.println("13. indexOf() method");
        System.out.println("Index of 'Hva': " + sb.indexOf("Hva"));
        System.out.println();

        // 14. lastIndexOf()
        System.out.println("14. lastIndexOf() method");
        System.out.println("Last index of 'a': " + sb.lastIndexOf("a"));
        System.out.println();

        // 15. toString()
        System.out.println("15. toString() method");
        String str = sb.toString();
        System.out.println("Converted String: " + str);
        System.out.println();

        // 16. getChars()
        System.out.println("16. getChars() method");
        char[] arr = new char[5];
        sb.getChars(0, 5, arr, 0);
        System.out.println("Character array: " + new String(arr));

        System.out.println("\nEnd of StringBuffer demonstration");
    }
}

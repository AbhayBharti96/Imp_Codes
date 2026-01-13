package StringMethods;
public class CapitalizeCharInSentence {
    public static void main(String[] args) {
        String a = "Hi i am abhay how are you";
        String x = "";
        String arr[] = a.split(" ");
        for(int i=0; i<arr.length; i++) {
            // Capitalize first letter + rest of word
            x += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1) + " ";
        }
        System.out.println(x.trim()); // remove last extra space
    }
}

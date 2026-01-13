package stringPracticeInterMediate;

class ToggleCase {

    public static void main(String[] args) {

        String str = "AbHaY";
        String result = "";

        for (char ch : str.toCharArray()) {

            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);// Add 32 to Convert Big to Small
            } else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);// Sub 32 to convert Small to Big 
            }
        }

        System.out.println(result);
    }
}

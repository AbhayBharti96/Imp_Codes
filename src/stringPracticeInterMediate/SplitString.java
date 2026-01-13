package stringPracticeInterMediate;

class SplitString {

    public static void main(String[] args) {

        String str = "Java is easy";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                System.out.println(word);
                word = "";
            }
        }

        System.out.println(word);
    }
}

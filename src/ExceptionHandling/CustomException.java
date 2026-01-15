package ExceptionHandling;

// Custom Exception Class
class Except extends Exception {

    // Constructor
    public Except() {
        super("Divide by zero not possible");
    }
}

public class CustomException {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            if (b == 0) {
                throw new Except(); // throwing custom exception
            }
            int result = a / b;
            System.out.println(result);

        } catch (Except e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

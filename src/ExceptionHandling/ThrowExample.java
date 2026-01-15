package ExceptionHandling;

class ArrayException extends Exception {
    ArrayException(String message) {
        super(message);
    }
}

public class ThrowExample {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        int index = 10;

        try {
            if (index >= arr.length) {
                throw new ArrayException(
                    "Sorry! You are trying to access an out-of-range element"
                );
            }
            System.out.println(arr[index]);

        } catch (ArrayException e) {
            System.out.println(e.getMessage());
        }
    }
}

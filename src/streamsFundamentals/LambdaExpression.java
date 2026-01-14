
/*
 * Lambda functions is an Anonnymous function
 * (no name, no return type,no acess modifier)
 */

package streamsFundamentals;
// Functional Interface
@FunctionalInterface
interface Sum {
    int add(int a, int b);
}

public class LambdaExpression {

    public static void main(String[] args) {

        int a = 2;
        int b = 10;

        // Lambda Expression
        Sum s = (x, y) -> x + y;

        // Calling method
        int ans = s.add(a, b);

        System.out.println("Sum is: " + ans);
    }
}

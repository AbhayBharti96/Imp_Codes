package streamsFundamentals;

import java.util.function.Function;

/*
 * It is an interface which is having on;y
 * abstract method apply()
 */
public class FunctionExample {
public static void main(String[] args) {
	Function<Integer,Integer>doubleIt = x ->2*x;
	Function<Integer,Integer>tripleIt = x ->3*x;
	System.out.println(doubleIt.apply(10));
	System.out.println(doubleIt.andThen(tripleIt)
			.apply(10));// This will do the task in sequence
	System.out.println(doubleIt.compose(tripleIt)
			.apply(30));//It apply second first then first
	Function<Integer,Integer>f = Function.identity();
	// This identity function return the same value whatever
	//we will pass to apply function..
	int r = f.apply(5);
	System.out.println(r);
}
}

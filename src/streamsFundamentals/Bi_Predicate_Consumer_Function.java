package streamsFundamentals;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Bi_Predicate_Consumer_Function {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;

		BiFunction<String, String, Integer> sum = (x, y) -> (x + y).length();
		BiConsumer<Integer, String> print = (x, y) -> {
			System.out.println("x is: " + x);
			System.out.println("y is: " + y);
		};

		System.out.println(isSumEven.test(5, 5));
		System.out.println(sum.apply("abhay", "bharti"));
		print.accept(10, "Abhay");
		
		// Instaed of Function we can use UnaryOpeartor because
		//after using this we dont have to tell return type also
		UnaryOperator<Integer>un = x->x*2;
		int ans=un.apply(20);
		System.out.println("Unary Output is: "+ans);
		//So for BiFunction also we can use BinaryOpeartor
		BinaryOperator<Integer> bn = (x,y)->x+y;
		int bns= bn.apply(5, 6);
		System.out.println("Binary Out is: "+bns);
		
		
		
		
	}

}

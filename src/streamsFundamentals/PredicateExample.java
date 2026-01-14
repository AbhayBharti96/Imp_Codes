package streamsFundamentals;

import java.util.function.Predicate;

/*
 *Predicate:-> It is an functinoal interface 
 *it contains only one abstract method
 *boolean valued funtion;
 *It holds only an condition
 */

public class PredicateExample {
public static void main(String[] args) {
	Predicate<Integer> isEven = x -> x%2==0;
	System.out.println(isEven.test(4));
	System.out.println(isEven.test(5));
	Predicate<String> isStart = x -> x.toLowerCase().startsWith("a");
	Predicate<String> isEnd = x -> x.toLowerCase().endsWith("y");
	Predicate<String> check = isStart.and(isEnd);
	System.out.println(check.test("Abhay"));
}
}

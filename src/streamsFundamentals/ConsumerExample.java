package streamsFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
// Consumer is an functional interface which doesnt 
	//return any output it only accept
	public static void main(String[] args) {
	Consumer<Integer>c = (x)->System.out.println(x);
	c.accept(5);// It will only consume..
	List<Integer>l = Arrays.asList(1,2,3);
	Consumer<List<Integer>>printList = (x)->{
		for(int i:x) {
		System.out.println(i);
	}
	};
	printList.accept(l);
}
}
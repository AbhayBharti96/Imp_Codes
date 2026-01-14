package streamsFundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodRefernce {

	public static void main(String[] args) {
	//Method refernce->it means we can use 
		//without invoking inplace of lambda 
	List<String>l=	Arrays.asList("Ram","Shyaam","Ghanshyaam");
		l.forEach(x->System.out.println(x+" "));
		System.out.println("Output after Refernce: ");
		l.forEach(System.out::println);//MethodReferncing
		
		//Constructor Reference
		List<String>name= Arrays.asList("A","B","C","D");
		name.stream().map(Phone::new).collect(Collectors.toList());
	}
	//Phone::new is the reference for the Constructor of Phone

}
class Phone{
	String name;
	Phone(String name){
		this.name = name;
	}
}

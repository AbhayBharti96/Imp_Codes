package Generics;
/*
 * Generic types allow you to define a class, interface,
   or method with placeholders (type parameters)
   for the data types they will work with.
   It helps to make the compile time type safety
 */
class Box<T>{
	private T value;

	public T getValue() {
		return value;
	} 

	public void setValue(T value) {
		this.value = value;
	}
}

/*Syntax: 
 *  class ClassName<T>{
	-- Class Body
}
*/
public class Main {
	public static void main(String[] args) {

		Box<Integer> box = new Box();
		box.setValue(24);
		System.out.println(box.getValue());
		
		
	}
}
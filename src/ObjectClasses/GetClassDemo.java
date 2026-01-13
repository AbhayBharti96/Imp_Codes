package ObjectClasses;
/*
 * getClass() method return an instance of type class
 * it tooks no parameter..
 */

public class GetClassDemo {

	public static void main(String[] args) {
		Integer i = 4;
		Class c = i.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.hashCode());

		

	}

}

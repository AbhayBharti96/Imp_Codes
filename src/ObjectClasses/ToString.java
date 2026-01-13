package ObjectClasses;

class Laptop{
	String name;
	int price;
	public String toString() {
		return name+" :"+price;// Overriding the toString() method
	}


/* By default when we try to print the object of class
 * it calls automatically toString() method and output is in the 
 * form getclass().getName()+"@"+Integer.toHexString((hashCode())
 * hasCode is a address of object.
 */



}
public class ToString {

	public static void main(String[] args) {
	Laptop l  = new Laptop();
	l.name="Lenovo";
	l.price = 1000;
	System.out.println(l.toString());
	Laptop l1 = new Laptop();
	l1.name="Lenovo";
	l1.price=1000;
	boolean r = l == l1;
	System.out.println(r);
	boolean r1 = l.equals(l1);
	System.out.println(r1);
	
	}


}

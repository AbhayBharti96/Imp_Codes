package ObjectClasses;
/*
 * here == and equals give false output if they both are having same data value
 * unitl or unless we provide the reference of each other to each other.. 
 */

class Mobile{
	String model;
	int price;
	public boolean equals(Mobile that) {
		if(this.model.equals(that.model)&& this.price==that.price) 
			return true;
		else 
			return false;
		}
}
public class Equals {
	

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		m1.model = "Poco";
		m1.price =15000;
		Mobile m2 = new Mobile();
		m2.model="Poco";
		m2.price = 15000;
		System.out.println(m1.equals(m2));//Compare the Data
	}

}

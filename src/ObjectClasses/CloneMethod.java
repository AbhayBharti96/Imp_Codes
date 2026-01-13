package ObjectClasses;


class Clone implements Cloneable{
	String name;
	int age;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
public class CloneMethod {

	public static void main(String[] args) throws CloneNotSupportedException {
		Clone c1 = new Clone();
		c1.name ="Abhay";
		c1.age=22;
		Clone c2 = (Clone)c1.clone();
		System.out.println("C1 data is: "+c1.name+" "+c1.age);
		System.out.println("C2 data is: "+c2.name+" "+c2.age);
	}

}

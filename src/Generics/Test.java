package Generics;


interface Printable{
	void print();
}
class MyNumber extends Number implements Printable{
private final int value;
public MyNumber(int value) { // Constructor
	this.value = value;
}
	@Override
	public void print() {
		System.out.println("MyNum: "+value);
		
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
class Boxx<T extends Number & Printable>{
	//Always first class and then interface bcz of non multiple inheritance
	//And it always use extends not implements
	private T item;
	public Boxx(T item) {
		this.item = item;
	}
	public void display() {
		item.print();
	}
	public T getItem() {
		return item;
	}
}

public class Test {
	public static void main(String []args) {
		MyNumber m = new MyNumber(12);
		Boxx <MyNumber>box = new Boxx<>(m);
		box.display();
		System.out.println(m.floatValue());
		
	}

}

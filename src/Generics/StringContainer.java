package Generics;

public class StringContainer<T>implements Container <T>{
private T item;
	@Override
	public void add(T item) {
		this.item=item;
		
	}

	@Override
	public T get() {
		
		return item;
	}
	public static void main(String []args) {
		StringContainer<String>s = new StringContainer<>();
		s.item="Abhay";
		System.out.println("Item is: "+s.get());
	}
	

}


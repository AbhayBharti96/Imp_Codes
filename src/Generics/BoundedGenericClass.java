package Generics;

class Type<T extends Number>{
	private T price;
	void setPrice(T price) {
		this.price = price;
	}
	T getPrice(){
		return price;
	}
}



public class BoundedGenericClass {

	public static void main(String[] args) {
		Type<Integer>t = new Type<>();
		t.setPrice(30);
		System.out.println("price is: "+t.getPrice());
		//Now if we want to change the type of Generic class
		//except number it shows error because we have extended the\
		//number class in T..
	}

}

package ExceptionHandling;

public class Main06 {

	public static void main(String[] args) {
	System.out.println(div(1,0));
	}
public static int div(int a,int b) {
	try {
		return a/b;
	}catch(Exception e) {
		System.out.println(e);
		return -1;
	}
}
}

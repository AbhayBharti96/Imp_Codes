package ExceptionHandling;


public class Main01 {

	public static void main(String[] args) {
	int [] n = {2,4,6,8,90};
	int [] m = {2,6,8,0,7,8};
	for(int i=0;i<n.length;i++) {
		System.out.println(divide(n[i],m[i]));
	}
	System.out.println("Good Work");
	}
	public static int divide(int a,int b) {
		try{
			return a/b;
		}catch(ArithmeticException e) {
			System.out.println(e);
			return -1;
		}
	}

	}



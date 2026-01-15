package ExceptionHandling;

public class FinallyKeyWordExample {

	public static void main(String[] args) {
	
		try{
			int a = Integer.parseInt("123abc");
		}catch(Exception e) {
			System.out.println("Exception is: "+e);
		}
		finally {
			System.out.println("Finally Always Executed");
		}
	}
	}



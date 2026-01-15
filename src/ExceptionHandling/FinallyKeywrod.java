package ExceptionHandling;

public class FinallyKeywrod {

	public static int Div(int a,int b) {
		try{
			return a/b;
		}catch(Exception e) {
			return -1;
		}
		finally {
			System.out.println("Bye Bye ");
		}
	}
	public static void main(String[] args) {
		
		System.out.println(Div(1,1));
	}

}
// Finally Always eexecute even exception 
// occurs or not and it is used to print
//custom message after execution and exception check
// Most used in return type exmaple
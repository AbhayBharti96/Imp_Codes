package ExceptionHandling;

import java.io.FileReader;

/*
 * To Throw the forcefully exception we can use throw keyword..
 * throw new RuntimeException(e)
 */
public class Main05 {


		public static void main(String[] args)throws Exception {
			Method2();
			System.out.println("Hello");
		}
		public static void Method2()throws Exception{
			Method1();
		}
		
		public static void Method1()throws Exception{
			try {
			FileReader f = new FileReader("a.txt");
		}catch(Exception e) {
			System.out.println("File Not Found");
			throw new RuntimeException("Oops");
		
		}


	}

}

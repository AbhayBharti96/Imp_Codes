package ExceptionHandling;
// Stack Trace.
public class Main03 {

	public static void main(String[] args) {
	try{
		level1();
	}catch(Exception o) {
//		StackTraceElement [] st =o.getStackTrace();
//		for(int i=0;i<st.length;i++) {
//			System.out.println(st[i]);
// -----------------  OR ------------------
		o.printStackTrace();
		}

	}

	
	public static void level3() {
		int []arr = new int[5];
		arr[5]=10;
	}
	public static void level2() {
		level3();
	}
	public static void level1() {
		level2();
	}
}
/* When exception propagate by one another method
 * Stack trace provide detailed information wherever the 
 * exception occur it will show the level wise exceptions
 * And If we use try catch at the main so it will show only
 * one exception.
 * Or we can say it shows the trace of method calls  
 */

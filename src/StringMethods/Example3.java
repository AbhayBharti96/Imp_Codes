package StringMethods;

public class Example3 {

	public static void main(String[] args) {

		String s1 = "Hello";
		// length()
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.endsWith("Z"));
		System.out.println(s1.charAt(0));
		char[] c = s1.toCharArray();
		System.out.println(c);
		
		int[] r = {1,2,3};
		System.out.println(r);
		
		String s2 = "Hii Hello Bye";
		String [] str = s2.split(" ");
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		String x = "Hii";
		System.out.println(x.concat("Everyone"));
		System.out.println(s1.substring(2,4));
		
		
		
		
	}
	

}
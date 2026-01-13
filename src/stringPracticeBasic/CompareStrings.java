package stringPracticeBasic;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.print("Enter the String x -> ");
        String x = s.nextLine();
        System.out.print("Enter the String y -> ");
        String y = s.nextLine();
        boolean result;
        if(x.equals(y)) {
        	result = true;
        	System.out.println("X is Equals to Y -> "+result);
        }else {
        	result =false;
        	System.out.println("X is Equals to Y -> "+result);
        }
	}

}

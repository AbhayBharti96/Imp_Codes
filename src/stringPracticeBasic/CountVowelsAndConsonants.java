package stringPracticeBasic;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String -> ");
		String x = s.nextLine();
		int vc = 0;
		int cc=0;
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)=='a'||(x.charAt(i)=='e')||
					(x.charAt(i)=='i')||(x.charAt(i)=='o')||(x.charAt(i)=='u')) {;
			vc++;
		}else {
			cc++;
	}
	}
		System.out.println("Vowels are -> "+vc);
		System.out.println("Consonants are -> "+cc);
	}
}



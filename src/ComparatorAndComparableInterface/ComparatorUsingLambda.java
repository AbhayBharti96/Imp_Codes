package ComparatorAndComparableInterface;

import java.util.*;
public class ComparatorUsingLambda {

	public static void main(String[] args) {
		List<String>word = Arrays.asList("Abhay","Muntazir","Aniket","Reema");
		word.sort(null);
		System.out.print("List After Normal Ordering(Sorted) --> ");
		System.out.println(word);
		word.sort((a,b)->b.length()-a.length());
		System.out.print("List after Custom ordering(Basis of Length) --> ");
		System.out.println(word);
		for(int i=0;i<word.size();i++) {
			System.out.println("Size of "+word.get(i)+" is -> "+word.get(i).length());
		}
	}

}

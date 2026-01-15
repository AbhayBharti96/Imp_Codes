package ComparatorAndComparableInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Comparator is an interface which helps to do 
 * the custom ordering.
 * By default it sort in Asc order 
 * it works by comparing the two objects of same type
 * int compare(o1,o2)
 */
class ListCompare implements Comparator<Integer>{
	public int compare(Integer a,Integer b)
{
		return b-a;
}
}
public class ComparatorDemo1 {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>(Arrays.asList(1, 10, 5, 11, 9, 8));
		System.out.println("List Before Custome Sorting: ");
		l.sort(null);
		System.out.println(l);
		l.sort(new ListCompare());
		System.out.println("List after Custom Sorting: ");
		System.out.println(l);
		
	
	}

}

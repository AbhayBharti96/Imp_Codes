package ComparatorAndComparableInterface;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



class StringLengthComparator implements Comparator<String> {

	public int compare(String s1, String s2) {
		return s1.length() - s2.length();

	}
}
// when length is negative it will print in reverse order
//when length is positive it will print in ascending order




public class ComparatorStringSorting {

	public static void main(String[] args) {
		List<String> word = Arrays.asList("Banana", "Apple", "Date");
		System.out.println("List After Default Sort: ");
		word.sort(null);
		System.out.println(word);
		System.out.println("List After Custom Sort:\n(On the basis of length) ");
		word.sort(new StringLengthComparator());
		System.out.println(word);
	}

}

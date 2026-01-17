package ArrayListCollectionOfList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SumOfCollections {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3);
		Iterator<Integer> i = l.iterator();
		int s=0;
		while(i.hasNext()) {
			s = s + i.next();
		}
		System.out.println("Sum is: "+s);
	}

}

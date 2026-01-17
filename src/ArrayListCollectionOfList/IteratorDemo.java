package ArrayListCollectionOfList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class IteratorDemo {

	public static void main(String[] args) {
		List<String>list= Arrays.asList("Abhay","Ankit","Akshat","Ajay");
		System.out.print("Printing List Using  Iterator -> ");
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		//--- List Iterator -> hasNext() next() previous() hasPrevious
		System.out.print("Output using ListIteator-> ");
		ListIterator j = list.listIterator();
		
		while(j.hasNext()) {
			System.out.print(j.next()+" ");
		}
		System.out.println();
		System.out.print("Reverse List using HasPrevious-> ");
		while(j.hasPrevious()) {
			System.out.print(j.previous()+" ");
		}
		
	}

}

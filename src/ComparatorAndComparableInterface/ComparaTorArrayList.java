package ComparatorAndComparableInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student{
	private String name;
	private double gpa;
	Student(String name,double gpa){
		this.name = name;
		this .gpa = gpa;
		
	}
	public String getName() {return name;}
	public double getGpa() {return gpa;}
	
	
}

public class ComparaTorArrayList {

	public static void main(String[] args) {
		
		
;
	List<Student> s = new ArrayList<>();
	s.add(new Student("Abhay",8.0));
	s.add(new Student("Abhi",9.0));
	s.add(new Student("Charlie",7.0));
	s.add(new Student("Bob",6.5));
	// Comparator: GPA descending, Name ascending
	Comparator<Student>c = Comparator.comparing(Student::getGpa).reversed()
			.thenComparing(Student::getName);
	for(Student x:s) {
		System.out.println("Name: "+x.getName()+" "+"\nCGPA: "+x.getGpa());
			System.out.println("------");
		}
	s.sort(c);
	System.out.println("--------- After Normal Sorting the List ------------");
	for(Student x:s) {
		System.out.println("Name: "+x.getName()+" "+"\nCGPA: "+x.getGpa());
			System.out.println("------");
		}
	}

	}



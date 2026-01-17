package ArrayListCollectionOfList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Students {
    String name;
    int id;

    Students(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Student: " + name + " " + id;
    }
}

public class SearchUsingId {

    public static void main(String[] args) {

        ArrayList l = new ArrayList();

        l.add(new Students("Akshat", 111));
        l.add(new Students("Sagar", 112));
        l.add(new Students("Toxsea", 113));

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the id: ");
        int id = s.nextInt();

        boolean r = false;

        Iterator i = l.iterator();
        while (i.hasNext()) {
            Students temp = (Students) i.next();

            if (temp.id == id) {
                r = true;
                System.out.println("Name exists..!!");
                System.out.println("Name is: " + temp.name);
                break;  
            }
        }

        if (!r) {
            System.out.println("Not exists...!!!!");
        }
    }
}

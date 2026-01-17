package ArrayListCollectionOfList;
import java.util.ArrayList;

class Student01 {

    String name;
    int id;

    Student01(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student: " + name + " " + id;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student01 that = (Student01) obj;
        return this.id == that.id && this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return id;
    }
}

public class MainApp {

    public static void main(String[] args) {

        ArrayList<Student01> stud = new ArrayList<>();

        stud.add(new Student01("Shraddha", 111));
        stud.add(new Student01("Sagar", 112));
        stud.add(new Student01("Toxsea", 113));

        System.out.println(stud);

        Object keyElement = new Student01("Shraddha", 111);
        System.out.println(stud.contains(keyElement)); // ✅ true
    }
}

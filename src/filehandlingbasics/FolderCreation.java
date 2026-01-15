package filehandlingbasics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FolderCreation {

    public static void main(String[] args) {

        File folder = new File("C:\\Users\\abhay\\Desktop\\442\\Codes");
        folder.mkdir();

        File f2 = new File(folder, "Emp.txt");
        File f3 = new File(folder, "Student.txt");

        try {
            f2.createNewFile();
            f3.createNewFile();

            // Writing
            FileWriter wr = new FileWriter(f2);
            wr.write("Hello Student");
            wr.close();
        }
        

            // Reading
//            FileReader fr = new FileReader(f2);
//            int ch;
//            while ((ch = fr.read()) != -1) {
//                System.out.print((char) ch);
//            }
//            fr.close();
//
         catch (IOException e) {
            e.printStackTrace();
        }
    
}
}

package filehandlingbasics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		File file= new File("C:\\Users\\abhay\\Desktop\\442\\Codes\\Emp.txt");
		try {
			FileWriter fr = new FileWriter(file);
			String str = "hello my name is fileWriter";
			fr.write(str);
			fr.close();
		}catch(IOException e) {
			System.out.println("Error Occured: "+e);
		}
		// ------------- To appned more text --------------
		try {
			FileWriter fr = new FileWriter(file,true);
			fr.append("\n New Line added");
			System.out.println("New Content is Added..");
			fr.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		// --------------Reading a File--------------------
		File f1 = new File("C:\\Users\\abhay\\Desktop\\442\\Codes\\ReadingFile.txt");
		try {
			System.out.println("----- Creating the File f1 -----");
			f1.createNewFile();
			System.out.println("File is Created");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			FileWriter fr1 = new FileWriter(f1);
			fr1.write("Hello i am New File");
			fr1.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			System.out.println("----Reading the File f1 -------");
			FileReader r = new FileReader(f1);
			int ch;
			while((ch=r.read())!=-1) {
				System.out.print((char)ch);
			}
			r.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

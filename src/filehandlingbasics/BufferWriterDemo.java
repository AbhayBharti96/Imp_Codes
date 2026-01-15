package filehandlingbasics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			BufferedWriter bw = new BufferedWriter(

					new FileWriter("C:\\Users\\abhay\\Desktop\\442\\Codes\\bf.txt"));

			System.out.println("File is Created named as: bf.txt");
			System.out.println("------- Writing in BFR ---------");
			bw.write("Hello I am from BufferedReader..");
			bw.newLine();
			bw.write("BFR is faster then FW");
			bw.close();
			System.out.println("Content is written");
		} catch (IOException e) {

			e.printStackTrace();
		}
		BufferedReader r = new BufferedReader(new FileReader("C:\\Users\\abhay\\Desktop\\442\\Codes\\bf.txt"));
		System.out.println("------ Reading the Content Using BFR -------");
		String line;
		try {
			while ((line = r.readLine()) != null) {
				System.out.println(line);

			}
			r.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

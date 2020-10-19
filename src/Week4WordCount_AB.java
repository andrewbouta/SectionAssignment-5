import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class Week4WordCount_AB {

	public static void main(String[] args) throws IOException {
		String line = null;
		String line2 = null;
		String[] words;
		BufferedReader br = null;
		BufferedReader br2 = null;

		int lines = 0, counts = 0, chars = 0;
		
		// Reads the .txt file, using a scanner
		FileInputStream fis = new FileInputStream("TheInnerGameOfTennis.txt");
		Scanner fileInput = new Scanner(fis);
		
		// Reads file directly
		try /*(br = new BufferedReader(new FileReader("TheInnerGameOfTennis.txt")))*/ {
			br = new BufferedReader(new FileReader("TheInnerGameOfTennis.txt"));
			br2 = new BufferedReader(new FileReader("lear.txt"));
		
			File myFile = new File("TheInnerGameOfTennis.txt");
			
			File learFile = new File("lear.txt");
			// String Name = myFile.getName();
			// FileReader reader = new FileReader(myFile);
		
			// Reads line by line from the file until null is returned
			while ((line = br2.readLine()) != null /* && (line2 = br2.readLine()) != null*/) {
				lines ++; 					// counts lines
				words = line.split("( )|(')");	// space delimiter
				counts += words.length;		
				chars += line.length();		// characters in the string
			} 
			
			/*// Tried getting output multiple content from separate files.
			System.out.println("File: " + myFile.getName());
			System.out.println("Lines: " + lines); 
			System.out.println("Words: " + counts);
			System.out.println("Chars: " + chars);
			*/

			System.out.println("File: " + learFile.getName());
			System.out.println("Lines: " + lines);
			System.out.println("Words: " + counts);
			System.out.println("Chars: " + chars);

			// Reads every line
			/*
			while ((line = br.readLine()) != null) lines++; {
				System.out.println(line);
				System.out.println("Lines = " + lines);
				String wordz[] = line.split(" ");
				
				// Counting each word
				counts += wordz.length;
				System.out.println("Words = " + counts);
				System.out.println("hello");
			}
			
			while((line = br.readLine()) != null) {
				
			}
			*/
		
		} catch (IOException ex) {
			System.err.println("Invalid Code.");
		}
		// Close scanner and file input stream
		fileInput.close();
		fis.close();
	}
}

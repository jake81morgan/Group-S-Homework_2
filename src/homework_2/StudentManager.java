package homework_2;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class StudentManager {
	{
		Student Students[];
		Scanner fileIn = null;
		try {
			// Attempt to open the file
			fileIn = new Scanner(new FileInputStream("StudentData.txt"));
		} catch (FileNotFoundException e) {
			// If the file could not be found, this code is executed
			// and then the program exits
			System.out.println("File not found.");
			System.exit(0);
		}
	}
}

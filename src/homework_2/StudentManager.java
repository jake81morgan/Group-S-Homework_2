package homework_2;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class StudentManager {
	
	private Student Students[];
	
	public boolean readFromFile(String fileName) {
		
		try {
			
			Scanner fileIn = new Scanner(new FileInputStream(fileName));
			
			// Counts number of students in file
			int count = 0;
			while(fileIn.hasNextLine()) {
				fileIn.nextLine();
				count++;
			}
			
			// Create student array
			Students = new Student[count];
			
			// Close scanner and reset it from the beginning of the file
			fileIn.close();
			fileIn = new Scanner(new FileInputStream(fileName));
			
			// Read data from file and initialize the Student objects
			for(int i = 0; i < count; i++) {
				int id = fileIn.nextInt();
				String name = fileIn.next() + " " + fileIn.next();
				double grade = fileIn.nextDouble();
				
				Students[i] = new Student(id, name, grade);
				
			}
			
			// Close file and return true
			fileIn.close();
			return true;
			
		} catch(FileNotFoundException e) {
			// Print error message and return false
			System.out.println("File not found.");
			return false;
		}
	}
}

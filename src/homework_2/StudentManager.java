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
			while (fileIn.hasNextLine()) {
				fileIn.nextLine();
				count++;
			}

			// Create student array
			Students = new Student[count];

			// Close scanner and reset it from the beginning of the file
			fileIn.close();
			fileIn = new Scanner(new FileInputStream(fileName));

			// Read data from file and initialize the Student objects
			for (int i = 0; i < count; i++) {
				int id = fileIn.nextInt();
				String name = fileIn.next() + " " + fileIn.next();
				double grade = fileIn.nextDouble();

				Students[i] = new Student(id, name, grade);

			}

			// Close file and return true
			fileIn.close();
			return true;

		} catch (FileNotFoundException e) {
			// Print error message and return false
			System.out.println("File not found.");
			return false;
		}

	}

	public void displayStudents() {

		// Tell user if no students exist
		if (Students.length == 0) {
			System.out.println("No students exist.");
		}

		// Print all student objects using toString
		for (Student student : Students) {
			System.out.println(student);
		}

	}

	public boolean searchStudentById(int search) {

		// Tell user if no students exist
		if (Students.length == 0) {
			System.out.println("No students exist.");
			return false;
		}

		// Check to see if specific student exist
		for (Student student : Students) {
			if (student.getId() == search) {
				return true;
			}
		}

		return false;

	}

	public boolean updateStudentGradeById(int id, double grade) {
		//Check to see if Student Exists
		if (searchStudentById(id)) {
			//Loop to go through Students array and get student variable equal to the student with matching id
			for (Student student : Students) {
				if (student.getId() == id) {
					//Set the new grade and return true
					student.setGrade(grade);
					return true;
				}
			}
		}
		//All cases do not output therefore error with finding or inserting grade, return false
		return false;
	}
}
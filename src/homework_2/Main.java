package homework_2;

public class Main {
	public static void main(String[] args) {
//// Instantiate StudentManager, perform operations based on the requirements.
		StudentManager studentManager = new StudentManager();
//// Read student data from a file and initialize Student objects.
		boolean fileReadStatus = studentManager.readFromFile("StudentData.txt");
		if(fileReadStatus) {
			System.out.println("File has been read.\n");
		} else {
			System.out.println("File read error.\n");
		}
//// Display all students.
		studentManager.displayStudents();
//// Search for a student by ID.
		int id = 104;
		boolean studentFound = studentManager.searchStudentById(id);
		if(studentFound) {
			System.out.println("\nStudent with ID " + id + " was found.\n");
		} else {
			System.out.println("Student with ID " + id + " was not found.\n");
		}
//// Update the grade of a student by ID.
		boolean studentGradeUpdateStatus = studentManager.updateStudentGradeById(104, 95);
		if(studentGradeUpdateStatus) {
			System.out.println("Student grade updated.");
		} else {
			System.out.println("Grade update error.");
		}
//// Display all students after the update.
		System.out.println("\nStudents after changing grade \n");
		studentManager.displayStudents();
	}
}

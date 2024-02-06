package homework_2;

public class Student {//Create a student class with private of the following fields: int id, String name, and double grade
	private int id;
	private String name;
	private double grade;

	public Student() {
		id = 0;
		name = "";
		grade = 0.0;
	}

	public Student(int Id, String Name, double Grade){
		this.id = Id;
		this.name = Name;
		this.grade = Grade;
	}
	
	//Initialize the Set methods
	public void setId(int ID) {
		this.id = ID;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	public void setGrade(double Grade) {
		this.grade = Grade;
	}
	
	//Initialize the Get methods
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getGrade() {
		return this.grade;
	}

	//Initialize a toString method to print out the student information
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}

	
}
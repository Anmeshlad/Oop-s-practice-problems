package BasicDemos;

public class StudentData {

	int rollNo;
	String name;
	Double percentage;
	
	public void initdetails() {
		rollNo=101;
		name="anmesh lad";
		percentage=75.18;
	}
	
	public void displayDetails() {
		System.out.println("Student RollNo:" +rollNo+ " / " +"Student Name:" + name + " / "+ "Student Marks:"+percentage);
	}

}

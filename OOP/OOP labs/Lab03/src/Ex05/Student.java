package Ex05;
//creating a child class from Person parent class
public class Student extends Person {
	
	String studentid;
	//Parameterized constructer of child class
	public Student(String name, String address, String studentid) {
		//attributes in parent class
		super(name,address);
		
		this.studentid = studentid;
	}
	
	public void showDetails() {
		
		
		super.showDetails();
		System.out.println("\nMy Student id : "+ studentid);
		
		
	}


}

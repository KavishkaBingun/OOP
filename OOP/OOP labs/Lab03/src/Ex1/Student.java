package Ex1;

public class Student {
	String name, ditNo, address;//declare variables
	
	/*public Student(String name, String ditno, String address)//parameterized constructor
	{
		this.name = name;
		this.ditNo = ditno;
		this.address = address;
	}*/
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setDitNo(String ditNo) {
		this.ditNo = ditNo;
	}
	public String getDitNo() {
		return this.ditNo;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return this.address;
	}
	
	
	
	public String getDetails() {
		
		String s = "I am a Student.\n"
				+ "My name is " + getName()+"\nI am from" + getAddress() + "\nMy dit no is " + getDitNo();
		return s;
	
		
	}
	
	
		
}






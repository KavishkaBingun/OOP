package EX01;
//Execise 01
public class Student {
	
	String name;
	String ditno;
	String address;
	
	
//Exercise 02
	/*public Student(String name, String ditno, String add) {
		this.name = name;
		this.ditno = ditno;
		this.address = add;
		
		
	}
*/
//Exercise 03
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDitno() {
		return ditno;
	}


	public void setDitno(String ditno) {
		this.ditno = ditno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	//Exercise 04
	public String getDetails() {
		
		String details = ("I am a Student.\r\n"
				+ "My name is .\r\n" + getName()
				+ "I am from  .\r\n" + getAddress()
				+ "My dit no is ")+ getDitno();
		
		return details;
		
		
		
		
	}


}

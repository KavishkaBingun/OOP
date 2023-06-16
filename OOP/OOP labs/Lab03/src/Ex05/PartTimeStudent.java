package Ex05;

public class PartTimeStudent extends Student {
	int workinghours;

	public PartTimeStudent(String name, String address, String studentid,int workinghours) {
		super(name,address,studentid);
		
		this.workinghours = workinghours;
		
	}
	
	public void showDetails() {
		
		super.showDetails();
		System.out.println("Working hours : "+ workinghours);
		
	}

}

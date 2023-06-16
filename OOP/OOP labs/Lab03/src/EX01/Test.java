package EX01;

public class Test {

	public static void main(String[] args) {
		
	/*	Student s1 = new Student("Kavishka","IT1234","Tangalle");
		Student s2 = new Student("Thisara", "IT3547","Tangalle");
		
		System.out.println("Name : "+ s1.name);
		System.out.println("Reg No : "+ s1.ditno);
		System.out.println("Address : "+ s1.address);
		
		System.out.println("************************");
		
		System.out.println("Name : "+ s2.name);
		System.out.println("Reg No : "+ s2.ditno);
		System.out.println("Address : "+ s2.address);*/
		
		Student s1 = new Student();
	
		s1.setName("Kavishka");
		s1.setDitno("IT1234");
		s1.setAddress("Tangalle");
	/*	
		System.out.println("Name : "+ s1.getName());
		System.out.println("Reg No : "+ s1.getDitno());
		System.out.println("Address : "+ s1.getAddress());*/
		
		
		System.out.println(s1.getDetails());
		
		

	}

}

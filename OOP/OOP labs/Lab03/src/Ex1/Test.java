package Ex1;

public class Test {

	public static void main(String[] args) {
		
		//Student s1 = new Student("Thisara","IT20135241","Tangalle");//creating object1
		//s1.name = "Thisara";
		//s1.ditNo = "IT20135241";
		//s1.address = "Tangalle";
		//Student s2 = new Student("Kavishka","IT21387630","Tangalle");//creating object2
		//s2.name = "Kavishka";
		//s2.ditNo = "IT21387630";
		//s2.address = "Tangalle";
		
		//Student s3 = new Student("Harshana","IT10203","Kadurupokuna");
		
		
		//System.out.println("Name : "+ s1.name + "\nDitNo : "+ s1.ditNo +"\nAddress: "+ s1.address);
		//System.out.println("\nName : "+ s2.name + "\nDitNo : "+ s2.ditNo +"\nAddress: "+ s2.address);
		//System.out.println("\nName : "+ s3.name + "\nDitNo : "+ s3.ditNo +"\nAddress: "+ s3.address);
		
		//Student s1 = new Student();
		//s1.setName("Kavishka");
		//s1.setDitNo("IT20135241");
		//s1.setAddress("Tangalle");
		
		//System.out.println("Name : "+ s1.getName() + "\nDitNo : "+ s1.getDitNo() +"\nAddress: "+ s1.getAddress());
		Student s1 = new Student();
		s1.name = "Thisara";
		s1.ditNo = "IT20135241";
		s1.address = "Tangalle";
		
		System.out.println(s1.getDetails());
		
		

	}

}

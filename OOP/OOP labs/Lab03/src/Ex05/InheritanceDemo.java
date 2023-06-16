package Ex05;

public class InheritanceDemo {


	public static void main(String[] args) {
		//creating an object in Person class
		Person p1 = new Person("Thisara" , "Tangalle");
		p1.showDetails();

		Student s1 = new Student("Kavishka","Tangalle","IT1234");
		s1.showDetails();
		
		PartTimeStudent pa1 = new PartTimeStudent("Harshana","Galle","IT52475",8);
		pa1.showDetails();
		

	}

}

package CodingExercise2;

public class MyMain {

	public static void main(String[] args) {
		//create objects 
		Printable E1 = new Employee("Kavishka" , 23 , "Tangalle\n");
		Printable B1 = new Book(12,"Success of Life", 500.00);
		//calling objects	
		E1.print();
		B1.print();

	}

}

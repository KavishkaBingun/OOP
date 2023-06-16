package CodingExercise2;

public class Book implements Printable{/* all the methods in interface should
	implement by the sub classes. so, this class must have implements keyword */
	
	int bookID;
	String Title;
	double price;

	public Book(int bookID, String title, double price) {//parameterized constructor
		
		this.bookID = bookID;
		this.Title = title;
		this.price = price;
	}
	
	public void print() {//print method in interface
		System.out.println("ID : " + this.bookID);
		System.out.println("Title : " + this.Title);
		System.out.println("Price : " + this.price);
		
		
	}
	
	

}

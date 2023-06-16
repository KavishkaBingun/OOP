package CodingExercise2;

public class Employee implements Printable{/* all the methods in interface should
implement by the sub classes. so, this class must have implements keyword */
	
   private String name;
   private int age;
   private String address;
   
   public Employee(String name, int age, String add){//parameterized constructor
	   
	   this.name = name;
	   this.age =  age;
	   this.address = add;
	   
   }
   
   public void print() {//print method in interface
	   System.out.println("Name : " + this.name);
	   System.out.println("Age : " + this.age);
	   System.out.println("Address : " + this.address);
	   
   }
   
	

}

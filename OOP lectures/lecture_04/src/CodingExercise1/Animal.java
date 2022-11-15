package CodingExercise1;

abstract public class Animal {/*There is a abstract method in class
so,class also should have anstract keyword*/
	
	public void eat() {
		
		System.out.println("I am eating");//concrete method
		//because this is unique to all the sub classes
		
	}
	

	abstract public void makeSound();/*This method can't implement in 
	super class. because sub classes of this super class return different 
	values from this method. so, this should be abstract method*/
	
	//abstract method havent body
	
	//this method must overide by sub classes
	
	//abstract classes can't make objects

}

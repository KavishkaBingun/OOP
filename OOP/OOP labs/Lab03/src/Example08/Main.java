package Example08;

public class Main {


	public static void main(String[] args) {
		Pet p = new Pet("Kitty", "Thisara",2);
		p.showDetails();
		//overloaded Pet constructor
		Pet po = new Pet("Lassi","Bingun");
		po.showDetails();
		
		Cat c = new Cat("brown","Kavishka",4,5);
		c.showDetails();
		c.getDetails();
		//overloaded Cat constructor
		Cat co = new Cat("Rockey","Sathsarani");
		co.showDetails();
		co.getDetails();
		
		Dog d = new Dog("Blakey","Perera",4,2);
		d.getDetails();
		

	}

}

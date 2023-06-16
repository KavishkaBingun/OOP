package Example08;

public class Dog extends Pet {
	int noOfMasters;

	public Dog(String n, String o, int a,int mast) {
		super(n,o,a);
		
		this.noOfMasters = mast;
	}
	
	public Dog(String n, String o) {
		super(n,o);
		
		
	}
	
	public void getDetails() {
		super.showDetails();
		System.out.println("I am a dog. I have "+this.noOfMasters+" masters");
	}

}

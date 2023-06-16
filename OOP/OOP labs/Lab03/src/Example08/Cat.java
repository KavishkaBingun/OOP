package Example08;

public class Cat extends Pet {
	private int livesLeft;

	public Cat(String n, String o, int a,int l) {
		super(n,o,a);
		
		this.livesLeft = l;
		
		
	}
	public Cat(String n, String o) {
		super(n,o);
		
	}
	
	public void getDetails() {
		System.out.println("I am a cat. "+ this.livesLeft + " lives remain for me");
	}

}

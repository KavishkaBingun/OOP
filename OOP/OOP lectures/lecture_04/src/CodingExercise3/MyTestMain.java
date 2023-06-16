package CodingExercise3;

public class MyTestMain {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		int a = 10;
		int b = 15;
		int c = 15;
		int x = 0;
		
		try {
			x = a/(b - c);//exception (devide by zero is gives error)
			System.out.println("Java");/*his line does not print because line after
			the exception can not compile. it directly jump to the matching catch statement*/
		
		}catch(ArithmeticException e) {//catch the exception
			
			System.out.println("Can not devide by zero");//print the error
			/*System.out.println(e); this is also correct but it will print as
			"java.lang.ArithmeticException: / by zero". */
		}
		
		System.out.println("Bye");/* because of usinh try catch block 
		these lines also print now*/
		System.out.println("X =" + x);
		int y = a/(b + c); 
		System.out.println("Y =" + y);
		}
		

	

}

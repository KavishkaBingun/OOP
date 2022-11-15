package CodingExercise6;

//Finally block

public class EX {
public static void main(String[] args) {
try {
String number = "123a";
int value = Integer.parseInt(number);
} catch (NumberFormatException ex) {
System.out.println("Wrong number format");
}finally {
System.out.println("End of operation");
}
}
}


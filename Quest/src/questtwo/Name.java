package questtwo;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		System.out.println("Enter your name and press <Enter>");
		Scanner myScanner = new Scanner(System.in);
		String a = myScanner.next();
		System.out.println("Hello, " + a);
		myScanner.close();
	}

}

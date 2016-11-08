package questtwo;
import java.util.Scanner;
public class OptimalniiVes {

	public static void main(String[] args) {
		int b = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your weight");
        int ves = sc.nextInt();
        System.out.println("Please enter your height");
        int height = sc.nextInt();
        int optimaVes = (height - b);
        if ( ves <= optimaVes ) {
			System.out.println("It`s OK. keep calm and go eat");
		} else {
				System.out.println("You Fat. You need go to fitness or not eating after midnight. And throw your refrigerator");
		}
        sc.close();  
	
	}
}
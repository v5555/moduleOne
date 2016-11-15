package questtwo;
import java.util.Scanner;
public class Year {

	public static void main(String[] args) {
		int year = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Year and press <Enter>");
        year = sc.nextInt();
        if (year%4==0 && year%100 !=0 || year%400==0) {
                System.out.println("This Year is leap");
        } else {
                System.out.println("This Year is not leap");
        }
        sc.close();
        }
}
package questtwo;
import java.util.Scanner;
public class dayOfWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number of day");
		int day = scan.nextInt();
		String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		scan.close();
		if (day<0 && day>8); {
			System.out.println(dayOfWeek[day-1]);
		}  if(day<8); {  System.out.println("Wrong number");
		}
		
	}
}
	
		






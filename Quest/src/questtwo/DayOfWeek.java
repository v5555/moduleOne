package questtwo;
import java.util.Scanner;
public class DayOfWeek {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number of day");
		int day = scan.nextInt();
		String dayString = null;
		switch (day) {//* метод перебирает введенные значения и выдает соответствующий день.
		case 1: dayString = "Monday";
				break;
		case 2: dayString = "Tuesday";
				break;
		case 3: dayString = "Wednesday";
				break;
		case 4: dayString = "Thusday";
				break;
		case 5: dayString = "Friday";
				break;
		case 6: dayString = "Saturday";
				break;
		case 7: dayString = "Sunday";
				break;
			default: dayString = "Wrong number";//* при введени не соответствующего значения выдаеться сообщение
					break;
		}
		scan.close();
		System.out.println(dayString);
	}
}

	
		






package tours;
import java.util.Scanner;

public class TourController {
	
		public void startApp (String [] args) {
			int firstChoice = 1;
			int secondChoice = 2;
			int thirdChoice = 3;
			int fourthChoice = 4;
				System.out.println("Выберете необходимый пункт меню:");
				System.out.println(firstChoice + ". Подобрать тур.");
				System.out.println(secondChoice + ". Вывести все туры списком.");
				System.out.println(thirdChoice + ". Записать в файл.");
				System.out.println(fourthChoice + ". . ");
			Scanner input = new Scanner(System.in);
			if(input.hasNextInt(2));{
					System.out.println(firstChoice + ". Активный отдых");
					System.out.println(secondChoice + ". Пассивный отдых");
					System.out.println(thirdChoice + ". Назад");
					input.nextInt();
				} if(input.hasNextInt(thirdChoice));
				{
					System.out.println("Выберете необходимый пункт меню:");
					System.out.println(firstChoice + ". Подобрать тур.");
					System.out.println(secondChoice + ". Вывести все туры списком.");
					System.out.println(thirdChoice + ". Записать список в текстовый файл.");
					System.out.println(fourthChoice + ". Загрузить из файла. ");
				} if (input.hasNextInt(secondChoice)){
					System.out.println("Список туров");
				} if (input.hasNextInt(fourthChoice)) {
					System.out.println("Загрузка файла");
				}
				
				
				
			
		}
	
}

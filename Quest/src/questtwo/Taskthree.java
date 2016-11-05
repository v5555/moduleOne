package questtwo;
import java.util.Scanner;
public class Taskthree {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.println("Please enter first number and press <Enter>");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();// принимает значение с клавиатуры
		System.out.println("Please enter second number and press <Enter>");
		b = sc.nextInt();
		if(a>b){
			System.out.println(a + " is greater");
			}
		else if(a<b) {
			System.out.println(b + " is greater");
			}// условие выводит значение на консоль в зваисимости от введенного числа
		sc.close();//завершение работы сканнера
	}
}

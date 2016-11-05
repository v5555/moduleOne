package questtwo;
import java.util.Scanner;
public class OptimalniiVes {

	public static void main(String[] args) {
		int weight = 1;
        int growth = 1;
        int a = 100;
        int b = (weight-a);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your weight");
        weight = sc.nextInt();
        System.out.println("Please enter your growth");
        growth = sc.nextInt();
        sc.close();
        if (b<=growth) {
                System.out.println("You so FAT!");
        } else {
        System.out.println("Your growth is normal. Keep calm and eat");
        }
}
}
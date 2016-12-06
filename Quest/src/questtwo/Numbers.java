package questtwo;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		float result = 1;
		Scanner sc = new Scanner(System.in);
		String res = "";
		System.out.println("Enter 1 the number");
		a = sc.nextInt();
		System.out.println("Enterr 2 the number");
		b = sc.nextInt();
		while (a==0) {
			System.out.println("Wrong number. Please enter correct number");
		a = sc.nextInt();
		if(a>0);
		while(b==0){
			System.out.println("Wrong number. Please enter correct number");
			b = sc.nextInt();
			if(b>0) break;				
		}
		sc.close();
		}
		result = (float) ((double) a/b);
		res = result + "";
		if(result % 1 ==0){
			res.replace(".0", "");
		}
		System.out.println(a + ":" + b + "=" + result);
	}

}

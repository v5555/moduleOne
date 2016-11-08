package questtwo;
import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Vvedite summu");
		int money = scan.nextInt();
		int mA = money % 10;
		int mB = money % 100;
		scan.close();
		if ((mA==0) || (mA>=5) && (mA<=9) || (mB>=11) && (mB<=14)) {
			System.out.println("Y vas " + money + " rubley");
		}
			else if ((mA<=0) && (mA>=3) || (mB>=5) && (mB<=11) || (mA==1) ){
				System.out.println("Y vas " + money + " rubl");
			}
				if ((mA>=2) && (mA<=4)) {
					System.out.println("Y vas " + money + " rublya");					
				}
			}
		}




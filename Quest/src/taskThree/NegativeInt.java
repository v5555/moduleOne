package taskThree;

public class NegativeInt {

	public static void main(String[] args) {
		int negativeInt = 0;
		int [] mass = {13, -28, -15, 33, 3, 0, -7, 9, -14, -20};
				for(int i = 0; i < mass.length; i++) {
				if (mass[i] < 0) negativeInt++;
			}
				System.out.println("Отрицательных значений " + negativeInt);
	}

}

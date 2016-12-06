package taskThree;

public class indexInt {

	public static void main(String[] args) {
		int mass [] = {112, 33, 18, 23, 48, 15, 25, 14, 33, 25, 44, 36, 99, 55, 74};
		int minimum = mass[0];
			for(int i = 0; i < mass.length; i++) {
				if(minimum > mass[i])
					minimum = mass[i];
				}
			System.out.println("Минимальное значение " + minimum);
			System.out.println("Порядковый номер " + findNumberinMass(mass, minimum));
	}

	private static int findNumberinMass(int[] mass, int index1) {
		for (int i = 0; i < mass.length; i++) {
			if(index1 == mass[i]){
				return i + 1;
			}
		}
		return 0;
	}

}

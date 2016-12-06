package taskThree;

import java.util.Arrays;

public class indexInt {

	public static void main(String[] args) {
		int mass [] = {10, 33, 18, 23, 2, 15, 25, 5, 33};
		int minimum = mass[0];
			for(int i = 0; i < mass.length; i++) {
				if(minimum > mass[i])
					minimum = mass[i];
				}
			System.out.println("Минимальное значение " + minimum + " " +  "Порядковый номер " + findNumberinMass(mass, minimum));
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

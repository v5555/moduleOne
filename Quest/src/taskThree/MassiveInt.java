package taskThree;

public class MassiveInt {

	public static void main(String[] args) {
		int [] masiv = {5, 7, 18, 25, 13, 4, 33, 64, 24, 22};
		int min = masiv[0];
		int max = masiv[0];
		for(int i = 0; i < masiv.length; i++) {
				if(max < masiv[i])
					max = masiv[i];
				if (min > masiv[i])
					min = masiv[i];
		}
		
		System.out.println("Максимальное значение: " + max);
		System.out.println("Минимальное значение: " + min);
	}

}

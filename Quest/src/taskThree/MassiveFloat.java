package taskThree;

public class MassiveFloat {

	public static void main(String[] args) {
		float[] massFl;
		
		massFl = new float[10];
		massFl[0] = (float) 5.5;
		massFl[1] = (float) 7.8;
		massFl[2] = (float) 3.2;
		massFl[3] = (float) 4.7;
		massFl[4] = (float) 5.2;
		massFl[5] = (float) 8.1;
		massFl[6] = (float) 13.4;
		massFl[7] = (float) 9.1;
		massFl[8] = (float) 18.2;
		massFl[9] = (float) 3.5;
		for(float f= 0; f<10; f++){
			System.out.println(((int)f+1) + "-й элемент массива = " + massFl[(int) f]);
			}
		int res = 0;
		for(int i = 0; i<massFl.length; i++) {
			res = (int) (res + massFl[i]);
			}
		int averangeV = res/10;
		System.out.println("Averange value is " + averangeV);
	}
}


 

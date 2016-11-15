package questtwo;

public class Questtwo {

	public static void main(String[] args) {
			String a = ("Добрый день. Как ваши дела? Вы придете сегодня на ужин?");
			int x = a.length();{//вычисляет кол-во символов
			System.out.println(x);// вывод количества символов в string a
		}
			String b = a.substring(0, a.length() /2); //делит строку на две части
			String c = a.substring(28, a.length());// указывает от какого символа начинать исчисление
			System.out.println(b);
			System.out.println(c);
			}

}

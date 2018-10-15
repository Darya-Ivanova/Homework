
public class Task3_7 {
	public static void main(String [] args) {
		int a = 100;
		int number1 = (int) (Math.random() * a);
		int number2 = (int) (Math.random() * a);
		int number3 = (int) (Math.random() * a);
		System.out.print("Первое число: " + number1 + "\nВторое число: " + number2);
		System.out.println();
		System.out.println("Разность: " + difference(number1, number2));
		System.out.print(conclusion(number1, number2, number3));
	}
		
	public static int difference (int aa, int bb) {
		int cc = aa - bb;
		return cc;
	}
	
	public static String conclusion(int aa, int bb, int cc) {
		return aa + " + " + bb + " + " + cc;
	}

}

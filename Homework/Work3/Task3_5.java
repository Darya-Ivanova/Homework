
public class Task3_5 {
	public static void main(String [] args) {
		int a = 100;
		int number1 = (int) (Math.random() * a);
		int number2 = (int) (Math.random() * a);
		System.out.print("Первое число: " + number1 + "\nВторое число: " + number2);
		System.out.println();
		
		difference(number1, number2);
	}
		
	public static void difference (int aa, int bb) {
		System.out.println(aa-bb);
	}
}

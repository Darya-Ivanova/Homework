
public class Task3_6 {
	public static void main(String [] args) {
		int a = 100;
		int number1 = (int) (Math.random() * a);
		int number2 = (int) (Math.random() * a);
		int number3 = (int) (Math.random() * a);
		conclusion(number1, number2, number3);
	}
		
	public static void conclusion (int aa, int bb, int cc) {
		System.out.print(aa + " + " + bb + " + " + cc);
	}

}

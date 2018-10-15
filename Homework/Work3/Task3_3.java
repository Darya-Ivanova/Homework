

public class Task3_3 {
	public static void main(String [] args) {
		int a = 100;
		int number = (int) (Math.random() * a);
		System.out.print("Число: " + number);
		System.out.println();
		System.out.println("Число возведенное в квадрат: " + pow(number));
				
	}
		
	public static int pow (int aa) {
		int cc = aa * aa;
		return cc;
	}


}

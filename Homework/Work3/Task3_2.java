

public class Task3_2 {
	public static void main(String [] args) {
		int a = 100;
		int number = (int) (Math.random() * a);
		System.out.print("Число: " + number);
		System.out.println();
		System.out.println("Число четное?: " + number(number));
				
	}
		
	public static boolean number(int aa) {
		return (aa%2 == 0);
	}

}

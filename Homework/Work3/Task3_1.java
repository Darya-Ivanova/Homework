
public class Task3_1 {
	public static void main(String [] args) {
		int a = 100;
		int number1 = (int) (Math.random() * a);
		int number2 = (int) (Math.random() * a);
		System.out.print("Первое число: " + number1 + " Второе число: " + number2);
		System.out.println();
		System.out.println("Минимальное число: " + min(number1, number2));
				
	}
		
	public static int min(int aa,int bb) {
		int cc = 0;
		if (aa > bb) {
			cc = bb;
		}
		else if (aa < bb) {
			cc = aa;
		}
		else {
			cc = aa;
		}
		return cc;
	}
}

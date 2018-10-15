
public class Task3_4 {
	public static void main(String [] args) {
		int a = 100;
		int number = (int) (Math.random() * a);
		System.out.print("Число: " + number);
		System.out.println();
		System.out.println("Число возведенное в куб: " + cube(number));
				
	}
		
	public static int cube (int aa) {
		int cc = aa * aa * aa;
		return cc;
	}


}

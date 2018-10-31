
public class MassiveMain {

	public static void main(String[] args) {
		
		Massive massive = new Massive();
		
		try {
			massive.divisionOfNumbers(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("The second value for devision is 0!");
		}
		
		try {
			massive.lineLength(-1);
		} catch (NegativeArraySizeException e2) {
			System.out.println("Error: " + e2 );
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Error: " + e1);
		}
		
		try {
			massive.ageField(100001);
		}
		catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
		try {
			massive.divisionOfNumbers(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("The second value for devision is 0!");
		} finally {
			System.out.println("END");
		}
	}
}

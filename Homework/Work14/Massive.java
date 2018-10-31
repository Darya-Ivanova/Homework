
public class Massive {
	
	private int firstNumber;
	private int secondNumber;
	private int theNumberOfLettersInTheString;
	private int maximumNumber = 1000;
	private int age;
	
	public int getFirstNumber() {
		return firstNumber;
	}
	
	public int getSecondNumber() {
		return secondNumber;
	}
	
	public int getTheNumberOfLettersInTheString() {
		return theNumberOfLettersInTheString;
	}
	
	public int getAge() {
		return age;
	}
	
	public int divisionOfNumbers (int firstNumber, int secondNumber){
		if (secondNumber == 0) {
			throw new ArithmeticException();
		}
		return firstNumber / secondNumber;
	}
	
	public int lineLength(int theNumberOfLettersInTheString) {
		if (theNumberOfLettersInTheString <= 0) {
			throw new NegativeArraySizeException();
		}
		if (theNumberOfLettersInTheString >= maximumNumber) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return theNumberOfLettersInTheString;
	}
	
	public int ageField(int age) {
		if (age < 0) {
			throw new NegativeArraySizeException("NegativeArraySizeException");
		}
		if (age > maximumNumber) {
			throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
		}
		return age;
	}
	
	

}

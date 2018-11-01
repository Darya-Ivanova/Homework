package pack;

public class Massive {
	private int [] mas = {1, 2, 3, 4, 5, 6};
	private int [] newMas = new int [mas.length];
	
	public int [] arrayFill() {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = i;
		}
		return mas;
	}
	
	public int [] addToTheArrayNumberOne() {
		for (int i = 0; i <= mas.length - 1; i++) {
        	if (i%2 == 0) {
        		mas[i] +=1;
        	}
		}
		return mas;
	}
	
	public int [] arrayElementDividedByIndex() {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = mas[i] / i;
			if (i == 0) {
				throw new ArithmeticException();
			}
		}
		return mas;
	}
	
	public int [] arrayMultipliedBy3() {
		for (int i = 0; i < mas.length; i++) {
			newMas[i]  = mas[i] * 3;
		}
		return newMas;
	}
	
	public int getSumOfElements () {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			sum += mas[i];
		}
		return sum;
	}
}

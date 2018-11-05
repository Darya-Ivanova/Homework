package pack;

public class Massive {
	private int[] mas = { 2, 3, 1, 4, 5, 6 };
	private int[] newMas = new int[mas.length];

	public int[] arrayFill() {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = i;
		}
		return mas;
	}

	public int[] addToTheArrayNumberOne() {
		for (int i = 0; i <= mas.length - 1; i++) {
			if (i % 2 == 0) {
				mas[i] += 1;
			}
		}
		return mas;
	}

	public int[] arrayElementDividedByIndex() {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = mas[i] / i;
			if (i == 0) {
				throw new ArithmeticException();
			}
		}
		return mas;
	}

	public int[] arrayMultipliedBy3() {
		for (int i = 0; i < mas.length; i++) {
			newMas[i] = mas[i] * 3;
		}
		return newMas;
	}

	public int getSumOfElements() {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			sum += mas[i];
		}
		return sum;
	}

	public int multiplyAllTheNumbersInTheArray() {
		int multiply = 1;
		for (int i = 0; i < mas.length; i++) {
			multiply *= mas[i];
		}
		return multiply;
	}

	public int[] reversArray() {
		int newMas[] = new int[mas.length];
		for (int i = 0; i < mas.length; i++) {
			newMas[i] = mas[mas.length - 1 - i];
		}
		return newMas;
	}

	public int[] sortTheArrayInAscendingOrder() {
		for (int i = mas.length - 1; i > 0; i--) {
			 for(int j = 0 ; j < i ; j++){
				 if (mas[j] > mas[j + 1]) {
					 int temp = mas[j];
					 mas[j] = mas[j + 1];
					 mas[j + 1] = temp;
				 }
			 }
		}
		return mas; 
	}
	
	public int[] clearArray() {
		mas = null;
		return mas;
	}
	
	public int getSumMinAndMaxElements() {
		int max = mas[0];
		int min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
			if (mas[i] < min) {
				min = mas[i];
			}

		}
		return min + max;
	}
}

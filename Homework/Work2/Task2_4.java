import java.util.Scanner;

public class Task2_4 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Введите размер массива: ");
		int size = scanner.nextInt();
		int a = 0;
		int b = 10;
		
		// create and fill array
		int[] mas = new int[size];
		for (int i = 0; i <= mas.length - 1; i++) {
			mas[i] = a + (int) (Math.random() * b);
		}
		
		// print array items
		for (int f : mas) {
			System.out.print(f + " ");
		}
		
		// count zeroes
		int zero = 0;
		int i = 0;
		while (i <= mas.length - 1) {
			if (mas[i] == 0) {
				zero++;
			}
			i++;
		}
		
		// print number of zeroes
		if (zero > 0) {
			System.out.println("\nКоличество нулевых элементов: " + zero);
		} else {
			System.out.println("\nНет нулевых элементов");
		}
		
	}

}

import java.util.Scanner;

public class Task2_8 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Введите размер массива: ");
		int size = scanner.nextInt();
		int b = 100;
		int[] mas = new int[size];

		for (int i = 0; i <= mas.length - 1; i++) {
			mas[i] = (int) (Math.random() * b);
		}

		for (int f : mas) {
			System.out.print(f + " ");
		}
		
		int max = 0;
		for (int i = 0; i < mas.length; i++) {
			if (max < mas [i])
				max = mas[i];
		}
		System.out.print("\nМаксимальное число = " + max);
		
		int min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i])
				min = mas[i];
		}
		System.out.print("\nМинимальное число = " + min);
	}

}

import java.util.Scanner;

public class Task2_12 {
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

		System.out.println();
		
		int [] mas1 = new int [size];

		for (int i = 0; i < mas.length; i++) {
			int index = i + 2;
			if (index >= mas.length) {
				index = index - mas.length;
			}
			mas1[index] = mas[i];
		}

		for (int f : mas1) {
			System.out.print(f + " ");

		}
	}
}

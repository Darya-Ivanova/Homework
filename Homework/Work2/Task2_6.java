import java.util.Scanner;

public class Task2_6 {
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

		for (int i = 0; i <= mas.length-1; i += 2) {
			int a = mas[i];
			mas[i] = mas[i + 1];
			mas[i + 1] = a;
		}
		System.out.println();

		for (int f : mas) {
			System.out.print(f + " ");
		}
	}
}

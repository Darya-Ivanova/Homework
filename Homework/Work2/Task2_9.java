import java.util.Scanner;

public class Task2_9 {
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
		int max_ind = 0;
		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
				max_ind = i;
			}
		}
		System.out.print("\nНомер максимального числа = " + max_ind);

		int min = mas[0];
		int min_ind = 0;
		for (int i = 0; i < mas.length; i++) {
			if (min > mas[i]) {
				min = mas[i];
				min_ind = i;
			}
		}
		System.out.print("\nНомер минимального числа = " + min_ind);

	}

}

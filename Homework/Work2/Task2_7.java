import java.util.Scanner;

public class Task2_7 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Введите размер массива: ");
		int size = scanner.nextInt();
		int b = 100;
		int[] mas = new int[size];

		for (int i = 0; i < mas.length ; i++) {
			mas[i] = (int) (Math.random() * b);
		}

		for (int f : mas) {
			System.out.print(f + " ");
		}
		
		System.out.println();
		
		int b1 = mas.length;
		for (int i = 0; i < mas.length / 2; i ++) {
			int a = mas[i];
			mas[i] = mas[b1-1];
			mas[b1-1] = a;
			b1--;
		}
	
		for (int f : mas) {
			System.out.print(f + " ");
		}
	}
}

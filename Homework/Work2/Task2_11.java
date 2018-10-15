import java.util.Scanner;

public class Task2_11 {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Введите размер массива: ");
		int size = scanner.nextInt();
		int b = 100;
		int[] mas1 = new int[size];

		for (int i = 0; i <= mas1.length - 1; i++) {
			mas1[i] = (int) (Math.random() * b);
		}

		for (int f : mas1) {
			System.out.print(f + " ");
		}
		
		System.out.println();
		
		int [] mas2 = new int [size];
		
		for (int i = 0; i < mas1.length; i++) {
			if (i == 0) {
				mas2[i] = mas1[i+1]/2;
			}
			else if (i == mas1.length - 1) {
				mas2[i] = mas1[mas1.length-1]/2;
			}
			else {
				mas2[i] = (mas1[i-1] + mas1[i+1]) / 2;
			}
			
		}
		for (int f : mas2) {
			System.out.print(f + " ");
		}

	}

}

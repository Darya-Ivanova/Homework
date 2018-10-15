import java.util.Scanner;

public class Task2_2 {
	private static Scanner scanner;

	public static void main(String[] args) {

        scanner = new Scanner (System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int a = 1;
        int b = 100;
        int sum = 1;
        int[] mas = new int[size];
        for (int i = 0; i <= mas.length - 1; i++) {
            mas[i] = a + (int) (Math.random() * b);
            sum = sum * mas[i];
        }
        for (int f : mas) {
            System.out.println(f);
        }
        System.out.println("\nПроизведение всех элементов = " + sum); 
    }

}

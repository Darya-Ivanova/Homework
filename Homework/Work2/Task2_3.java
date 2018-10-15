import java.util.Scanner;

public class Task2_3 {
	private static Scanner scanner;

	public static void main(String[] args) {

        scanner = new Scanner (System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int a = 1;
        int b = 100;
        int[] mas = new int[size];
        for (int i = 0; i <= mas.length - 1; i++) {
            mas[i] = a + (int) (Math.random() * b);
        }
        for (int f : mas) {
            System.out.print(f + " ");
        }
        System.out.println("\nПервый способ:");
        for(int i = 2; i <= mas.length - 1; i+=3) { 
        	mas[i] *= 2;
        }
        for(int h : mas){
        	System.out.print(h + " ");
        }
        System.out.println("\nВторой способ:");
        for (int i = 2; i <= mas.length - 1; i++) {
        	if (i%3 == 0);
        		mas[i] *=2;
        }
        for (int l : mas) {
        	System.out.print(l + " ");
        }
	}

}

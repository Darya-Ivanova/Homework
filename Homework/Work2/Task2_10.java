import java.util.Scanner;

public class Task2_10 {
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
		
		 boolean x = true;
	        for (int i = 1; i < mas.length; i++) {
	             if(mas[i] <= mas[i-1]){
	                x = false;
	                break;
	            }
	        }
	        if(x){
	            System.out.println("\nМассив является строго возрастающей последовательностью");
	        } else {
	            System.out.println("\nМассив не является строго возрастающей последовательностью");
	        }

	}

}

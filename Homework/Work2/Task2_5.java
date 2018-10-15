import java.util.Scanner;

public class Task2_5 {
	private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner (System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int b = 10;
        int[] mas = new int[size];
        for (int i = 0; i <= mas.length - 1; i++) {
            mas[i] =  (int) (Math.random() * b);
        }
        for (int f : mas) {
            System.out.print(f + " ");
        }
        
     	int i = 0;
     	int y = 0;
     	System.out.println("\nНомера нулевых элементов: ");
     	while (i <= mas.length - 1) {
     		if (mas[i] == 0) {
     		y++;
     			System.out.print( i + " ");
        	}
     		i++;
     	} 
     	
     	if (y > 0){
     		System.out.println();
 		}else{
 			System.out.println("Нет нулевых элементов");
 		}
	}
}


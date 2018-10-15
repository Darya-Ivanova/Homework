import java.util.Scanner;

public class Task2_1 {
	private static Scanner in;

	public static void main(String[] args) {
        int[] a = new int[7];
        int i = 0;
        in = new Scanner (System.in);
         for (int j = 0; j < a.length; j++) {
			System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
			a[i] = in.nextInt();
			System.out.println(a[i] + " - ");
			i++;
		}
    for (int element : a)
            System.out.print(element + " ");
}
}

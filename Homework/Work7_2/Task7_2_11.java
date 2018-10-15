// В заданном тексте найти сумму всех встречающихся цифр

import java.util.Scanner;

public class Task7_2_11 {
    public static void main(String[] args) {

        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        char[] chars = text.toCharArray();
        int sum=0;
        for(int i = 0; i < chars.length; i++) {
            if ((byte)chars[i] >= 0x30 && (byte)chars[i] <= 0x39)
                sum += (byte)chars[i] - 0x30;
        }
        System.out.println("Сумма всех чисел в строке равна " + sum);
    }
}

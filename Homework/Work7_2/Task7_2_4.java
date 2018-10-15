// Из текста удалить все символы, кроме пробелов, не являющиеся буквами. Меджу последовательностями
// подряд идущих букв оставить хотя бы один пробел.

import java.util.Scanner;

public class Task7_2_4 {
    public static void main(String[] args) {

        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        char[] charArray = text.toCharArray();

        for(char x : charArray){
            if(Character.isLetter(x)){
                System.out.print(x + " ");
            }
        }

    }
}

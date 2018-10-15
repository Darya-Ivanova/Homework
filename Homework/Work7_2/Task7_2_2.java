//После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово

import java.util.Scanner;

public class Task7_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        System.out.print("Введите подстроку: ");
        String substring = scanner.nextLine();
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();


        String[] splitString = text.split(" ");
        String ourFinalString = new String();

        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].endsWith(substring)) {
                ourFinalString += splitString[i].concat(" " + word + " ");
            } else {
                ourFinalString += splitString[i].concat(" ");
            }
        }

        System.out.println(ourFinalString);
    }
}

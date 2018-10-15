// В тексте найти первую подстроку максимальной длины, не содержащую букв.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task7_2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println(findMaxSub(text));
    }

    public static String findMaxSub(String text) {
        return Arrays.stream(text.split(" "))
                .filter(word -> word.matches("[^a-zA-Z]+"))
                .max(Comparator.comparingInt(String::length))
                .get();
    }
}

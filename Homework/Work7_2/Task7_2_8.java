// В тексте определить все согласные буквы, встречающиеся не более чем в двух словах.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Task7_2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        System.out.println(getConsonants(text));
    }

    public static Set<Character> getConsonants(String text) {
        List<String> firstTwoWords = Arrays.stream(text.toLowerCase()
                .split(" ")).limit(2).collect(Collectors.toList());
        String oneStr = String.join("", firstTwoWords);
        Set<Character> consonants = oneStr.replaceAll("[\\d\\s\\Waeiouy]", "")
                .chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
        return consonants;
    }
}

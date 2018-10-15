// Преобразовать текст так, чтобы каждое слово, не содержащее неалфовитных символов, начиналось с
// заглавной буквы.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7_2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        StringBuilder text = new StringBuilder(scanner.nextLine());

        List<String> words = Arrays.asList(text.toString().split("\\s+"));
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher;
        for (int i = 0; i < words.size(); i++) {
            matcher = pattern.matcher(words.get(i));
            if (matcher.matches()) {
                System.out.print(words.get(i).substring(0,1).toUpperCase()+words.get(i).substring(1)+" ");
            }
            else System.out.print(words.get(i)+" ");
        }
    }
}

import java.util.HashSet;
import java.util.Scanner;

public class Task7_7 {
	public static boolean hasUniqueChars(String word) {
        HashSet<Character> uniqueChars = new HashSet<Character>();
        for (Character ch : word.toCharArray()) {
            if (!uniqueChars.add(Character.toLowerCase(ch))) {
                return false;
            }
        }
        return true;
    }

    public static void findWordWithOnlyDifferentSymbols(String[] sourceWords) {
        for (String word : sourceWords) {
            if (word.length() > 1 && hasUniqueChars(word)) {
                System.out.println("Слово, состоящее только из различных символов: " + word);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество слов:");
        int numberString = scanner.nextInt();

        String[] mas = new String[numberString];

        System.out.println("Введите слова, разделяя их пробелом: ");
        for (int i = 0; i < numberString; i++) {
            mas[i] = scanner.next();
        }
        findWordWithOnlyDifferentSymbols(mas);
    }

}

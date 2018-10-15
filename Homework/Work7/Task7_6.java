import java.util.Scanner;

public class Task7_6 {
	public static void main(String[] args) {

        System.out.println("Введите количество слов:");
        Scanner scanner = new Scanner (System.in);
        if (scanner.hasNextInt ()) {
            int numberString = Integer.parseInt (scanner.nextLine());
            System.out.println("Введите слова, разделяя их пробелом: ");
            String text = scanner.nextLine ();
            int wordCount = 0;
            for (String word :
                    text.split (" ", numberString)) {
                int count = 0;
                for (int i = 1; i < word.length (); i++) {
                    if (word.toCharArray ()[i] > word.toCharArray ()[i - 1]) {
                        count++;
                    }
                }
                if ((word.length () - 1 == count) && (word.length () > 1) && (wordCount == 0)) {
                    System.out.println (word);
                    wordCount++;
                }

            }
            if (wordCount == 0)
                System.out.println ("Не найдено");
        }
    }
}

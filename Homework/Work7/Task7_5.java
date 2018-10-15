import java.util.Scanner;

public class Task7_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество слов:");
		int numberString = scanner.nextInt();
		String[] mas = new String[numberString];
		System.out.println("Введите слова, разделяя их пробелом: ");
		for (int i = 0; i < numberString; i++) {
			mas[i] = scanner.next();
		}

		int numWordsWithEqualLetters = 0;
		for (int i = 0; i < numberString; i++) {
			int countEngLetters = 0;
			int balance = 0;
			for (Character letter : mas[i].toCharArray()) {
				if (((letter >= 'A') && (letter <= 'Z')) || ((letter >= 'a') && (letter <= 'z'))) {
					countEngLetters++;
					if ((letter == 'A') || (letter == 'E') || (letter == 'I') || (letter == 'O') || (letter == 'U')
							|| (letter == 'Y') || (letter == 'a') || (letter == 'e') || (letter == 'i')
							|| (letter == 'o') || (letter == 'u') || (letter == 'y')) {
						++balance;
					} else {
						--balance;
					}
				}
			}
			if (countEngLetters == mas[i].length()) {
				if (balance == 0) {
					++numWordsWithEqualLetters;
				}
			}

		}
		System.out.println(numWordsWithEqualLetters);
	}
}

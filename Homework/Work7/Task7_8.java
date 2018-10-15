import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7_8 {
	public static void main(String[] args) {
		
		System.out.println("Введите количество слов:");
		Scanner scanner = new Scanner(System.in);
		
		int numberString = Integer.parseInt(scanner.nextLine());
		System.out.println("Введите слова, разделяя их пробелом: ");
		String text = scanner.nextLine();
		
		int countPalindromeNum = 0;
		String neededPalindrome = null;
		for (String word : text.split(" ", numberString)) {
			Pattern isItNumber = Pattern.compile("\\d+");
			Matcher mIsItNumber = isItNumber.matcher(word);
			if (mIsItNumber.find()) {
				if (word.equals(new StringBuilder(word).reverse().toString())) {
					countPalindromeNum++;
					if (countPalindromeNum == 1) {
						neededPalindrome = word;
					}
					else if (countPalindromeNum == 2) {
						System.out.println(word);
					}
				}
			}
		}
		
		if (countPalindromeNum == 0) {
			System.out.println("Не найдено");
		}
		if (countPalindromeNum == 1) {
			System.out.println(neededPalindrome);
		}
	}
}

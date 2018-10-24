package package1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanStr = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		Scanner scanStr2 = new Scanner(System.in);
		
		Sentence sentence = new Sentence();
		sentence.printClassName();
		sentence.printText();
		sentence.printEnterTheNumberOfWords();
		int numberOfWords = scanInt.nextInt();
		
		sentence.printEnterText();
		String[] text = new String[numberOfWords];
		for (int i = 0; i < text.length; i++) {
			text[i] = scanStr.next();
		}
		
		sentence.printEnterTheСharacterToBeReplaced();
		String characterToBeReplaced = scanStr2.next();
		
		Word word = new Word();
		word.replaceСharacter(text, characterToBeReplaced);
	}
}

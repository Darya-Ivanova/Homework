import java.util.Scanner;

public class Task7_4 {
	
	public static int countUniqueCharacters(String input){
	    String unique = input.replaceAll("(?i)(.)(?=.*?\\1)", "");
	    return unique.length();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
        System.out.println("Введите количество слов:");
        int numberString = scanner.nextInt();

        String[] mas = new String[numberString];

        System.out.println("Введите слова, разделяя их пробелом: ");
        for (int i = 0; i < numberString; i++) {
            mas[i] = scanner.next();
        }
        
        String goal = mas[0];
        for (int i = 0; i < numberString; i++) {
        	if (countUniqueCharacters(mas[i]) < countUniqueCharacters(goal)) {
        		goal = mas[i];
        	}
        }
        System.out.println("Cлово, в котором число различных символов минимально: " + goal);
    }
}


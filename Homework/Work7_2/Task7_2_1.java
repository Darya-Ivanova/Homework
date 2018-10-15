import java.util.Scanner;

//В тексте после k-го символа вставить подстроку
public class Task7_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        System.out.print("Введите подстроку: ");
        String substring = scanner.nextLine();
        System.out.print("Введите символ: ");
        int k = scanner.nextInt();
        System.out.println("Результат: ");
        System.out.println(putSubstring(text, substring, k));
    }

    public static String putSubstring(String text, String substring, int k) {
        StringBuilder sb = new StringBuilder();
        if (text != null && substring != null && k > 0) {
            int count = 1;
            for (int i = 0; i < text.length(); i++) {
                sb.append(text.charAt(i));
                if (count == k) {
                    sb.append(substring);
                }
                if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
                    count = 0;
                }
                count++;
            }
        }
        return sb.toString();
    }
}

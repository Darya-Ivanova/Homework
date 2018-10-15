// Удалить из текста его часть, заключенную между двумя символами, которые вводятся (например, между
// скобками "(" и ")" или меджу хвездочками "*" и т.п.).

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7_2_5 {
    public static void main(String[] args) {

        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String [] str = text.split(" ");
        StringBuffer stringBuffer = new StringBuffer();

        Pattern pattern = Pattern.compile("^[(].*[)]$");
        for (String string : str) {
            Matcher m = pattern.matcher(string);
            if(!m.matches()){
                stringBuffer.append(string);
                stringBuffer.append(" ");
            }
        }
        System.out.println(stringBuffer.toString());
    }
}

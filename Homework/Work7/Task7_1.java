import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_1 {
	public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк:");
        int numberString=Integer.parseInt(reader.readLine()) ;

        String shortString=null;
        String longString=null;
        for (int i=0; i< numberString; i++){
            System.out.println("Введите строку номер " + (i+1));
            String currentString = reader.readLine();
            if (shortString==null || currentString.length()<shortString.length()){
                shortString=currentString;
            }
            if (longString==null || currentString.length()>longString.length()){
                longString=currentString;
            }
        }
        System.out.println("Самая короткая строка = " + shortString);
        System.out.println("Ее длина равна " + shortString.length());
        System.out.println("Самая длинная строка = " + longString);
        System.out.println("Ее длина равна " + longString.length());
    }
}

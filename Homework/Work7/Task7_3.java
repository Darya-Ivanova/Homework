import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк:");
        int numberString = Integer.parseInt(reader.readLine());

        String[] mas = new String[numberString];

        for (int i = 0; i < numberString; i++) {
            System.out.println("Введите строку номер " + (i + 1));
            mas[i] = reader.readLine();
        }

        int average = 0;
        for(String item : mas){
            average += item.length();
        }
        average /= mas.length;

        System.out.println("Средняя длина строки = " + average);
        System.out.println("Строки, длина которых меньше, чем средняя длина строки: ");

        for(int i = 0; i < mas.length; i++){
            if (mas[i].length() < average){
                System.out.println(mas[i] + " eё длина = " + mas[i].length());
            }
        }
}	
}

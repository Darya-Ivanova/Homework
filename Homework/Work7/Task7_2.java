import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7_2 {
	public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк:");
        int numberString = Integer.parseInt(reader.readLine());

        String[] mas = new String[numberString];

        for (int i = 0; i < numberString; i++) {
            System.out.println("Введите строку номер " + (i + 1));
            mas[i] = reader.readLine();
        }

        for(int i = mas.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( mas[j].length() >mas[j+1].length() ){
                    String tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                }
            }
        }

        for(int i = 0; i < numberString; i++){
            System.out.println(mas[i]);
        }
    }
}

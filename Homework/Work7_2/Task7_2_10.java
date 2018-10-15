// Подсчитать количество содержащихся в данном тексте знаков препинания.

import java.util.Scanner;

public class Task7_2_10 {
    public static void main(String[] args) {

        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        char [] character = {'.',',','-',':',';','?','!'};
        int count = 0;

        char[]ch = text.toCharArray();
        for(int i = 0; i < ch.length; i++){
            for(int j = 0; j < character.length; j++){
                if(ch[i] == character[j]){
                    count++;
                }
            }
        }
        System.out.println("Знаков препинания: "+count);
    }
}

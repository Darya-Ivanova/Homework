// Определить сколько раз в тексте определяется каждое слово, которое встречается в нем.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task7_2_6 {
    public static void main(String[] args) {

        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String [] words = text.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");

        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}

package RKotsurLesson36;
//*Написать программу для подсчета наиболее встречающихся слов в неком тексте произведения Алиса в стране чудес.
//Файл с текстом прилагается.
//При выводе результатов привести первые 10 наиболее встречающихся слова с указанием их количества.

import java.io.*;
import java.util.*;

public class CountWord {
        public static void main(String[] args) throws UnsupportedEncodingException {
            try {
                FileInputStream fis = new FileInputStream("alice.txt");
                BufferedInputStream bfis = new BufferedInputStream(fis);
                InputStreamReader isr = new InputStreamReader(bfis, "UTF8");
                Scanner scanner = new Scanner(isr);
                List<String> strings = new ArrayList<>();

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine().trim();
                    strings.add(line);
                }
                String[] text = strings.toArray(new String[strings.size()]);
                String message = Arrays.toString(text);
                String[] words = message.toLowerCase().replaceAll("[-.?!)(,:@\"]", " ").split("\\s");
                Map<String, Integer> counterMap = new HashMap<>();
                for (String word : words) {
                    if (!word.isEmpty() && word.length() > 3) {
                        Integer count = counterMap.get(word);
                        if (count == null) {
                            count = 0;
                        }
                        counterMap.put(word, ++count);
                    }
                }
                scanner.close();
                counterMap.entrySet().stream()
                        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                        .limit(5)
                        .forEach(System.out::println);
            } catch (FileNotFoundException e) {
                e.getMessage();
            }
        }
    }


package HAG.Lesson9;

import java.util.Scanner;

/**
 * Created by 1 on 19.01.2019.
 */
public class HwTask2 {
    public static void main(String[] args) {
        String  s = new String("Маша ела кашу ");
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        String result = s.concat(scanner.next());
        System.out.println(result);
    }
}

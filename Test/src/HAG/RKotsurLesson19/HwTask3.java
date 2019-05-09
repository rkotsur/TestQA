package HAG.RKotsurLesson19;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 3)	Пользователь вводит текст, в котором имеются
 * несколько идущих подряд цифр. Написать метод,
 * который получает число, образованное этими цифрами
 * (сделать проверку на наличие цифр в тексте, вывести
 * первые идущие подряд цифры, остальные не нужно).
 */
public class HwTask3 {
    public static void main(String[] args) {
        System.out.println(hwTask3(getLine()));
        //hwTask3(getLine());
    }

    public static String getLine() {
        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String s=scanner.nextLine();
        scanner.close();
        return s;

    }

    public static String hwTask3(String s) {

        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(s);
        String ss ="Цифр нет в тексте";
        int i=0;
        while (matcher.find() && (i == 0)) {
                i = 1;
           // System.out.println(matcher.group());
                return matcher.group();
            }
        return ss;
    }

}



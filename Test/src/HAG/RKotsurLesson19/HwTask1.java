package HAG.RKotsurLesson19;

import java.util.Scanner;

/**
 * 1)	Написать метод, который получает слово и
 * определяет одинаковы ли второй и четвертый символы в нем.
 */
public class HwTask1 {
    public static void main(String[] args) {
        lineCheck();
    }
    public static void lineCheck(){
        System.out.println("Введите слово");
        Scanner scanner =new Scanner(System.in);
        String s = scanner.next();
        if (s.charAt(1)==s.charAt(3)){
            System.out.println("Символи 2 "+s.charAt(1)+" и 4 " +s.charAt(3)+" одинаковые в слове " +s);
        }else {
            System.out.println("Разные символы 2 " +s.charAt(1)+" и 4 " +s.charAt(3)+" разные в слове " +s);
        }

    }
}

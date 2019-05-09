package HAG.Lesson9;

import java.util.Scanner;

/**
 * Created by 1 on 19.01.2019.
 */
public class HwTask1 {
    public static void main(String[] args) {
        String s = new String("Маша ела кашу");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер символа до " + s.length());
        int value = scanner.nextInt();
        if (value == 0) {
            System.out.println("Brake");
        }
        else{
                if (value > s.length()) {
                    System.out.println("Значение больше строки");
                } else {

                    System.out.println("Указаный символ " + s.charAt(value - 1));
                }
            }
        }
    }

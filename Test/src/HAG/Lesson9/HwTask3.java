package HAG.Lesson9;

import java.util.Scanner;

/**
 * Created by 1 on 19.01.2019.
 */
public class HwTask3 {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона начиная +код страны");
        Scanner scanner = new Scanner(System.in);

       // String s = new String("+380636103366");
        String phoneNumber=scanner.next();
        boolean b= phoneNumber.matches("(\\+*)\\d{2}");
        if (b){
            System.out.println("Это номер телефона "+phoneNumber);
        }
        else {
            System.out.println("Это не номер телефона "+phoneNumber);
        }

    }
}

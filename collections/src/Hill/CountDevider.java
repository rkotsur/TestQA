package Hill;

import java.util.Scanner;

/**
 * Created by 1 on 09.08.2016.
 */
public class CountDevider {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число ");
        int count=s.nextInt();
        System.out.println("Введите первый делитель");
        int devider1=s.nextInt();
        System.out.println("Введите второй делитель");
        int devider2= s.nextInt();
        if (count%devider1==0&&count%devider2==0){
            System.out.println("Оба делиетеля делят " +count+" число без остатка");
        }
        else System.out.println("Одно или оба числа не делят "+count+ " без остатка");
    }
}

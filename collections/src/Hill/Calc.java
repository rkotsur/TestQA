package Hill;

import java.util.Scanner;

/**
 * Created by 1 on 10.08.2016.
 */
public class Calc {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        char operation;
        double result;
        double count1, count2;
        System.out.println("Введите первое число");
        count1= s.nextInt();
        System.out.println("Ведите второе число");
        count2=s.nextInt();
        System.out.println("Введите действие над числами (+-*/)");
        operation=s.next().charAt(0);
        switch (operation){
            case '+':
                System.out.println("Результат "+(count1+count2));break;
            case'-':
                System.out.println("Результат "+(count1-count2));break;
            case '*':
                System.out.println("Результат "+(count1*count2));break;
            case'/':
                System.out.println("Результат "+(count1/count2));break;
            default:
                System.out.println("Действие не известно");

        }



    }
}

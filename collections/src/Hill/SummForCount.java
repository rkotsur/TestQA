package Hill;

import java.util.Scanner;

/**
 * Created by 1 on 10.08.2016.
 */
public class SummForCount {
    public static void main (String []args){
        Scanner s = new Scanner(System.in);
        int summAll;
        System.out.println("Введите число до 4 знаков");
        summAll= s.nextInt();
        if (summAll>999){
            int a,b,c,d;
            a=summAll/1000;

            b=(summAll-a*1000)/100;
            c=(summAll-a*1000-b*100)/10;
            d=(summAll-a*1000-b*100-c*10);
            System.out.println("Считаем числа больше 1000 "+a+" "+b+" "+c+" "+d);
            int result=a+b+c+d;
            System.out.println("Сумма четырёх значного числа " +result);
            return;
            }

        if (summAll>=100){
            int b,c,d;
            b=summAll/100;
            c=(summAll-b*100)/10;
            d=(summAll-b*100-c*10);
            System.out.println("Считаем числа меньше 1000 " +b+" "+c+" "+d);
            int result=b+c+d;
            System.out.println("Сумма четырёх значного числа " +result);
            System.out.println("посчитать треёх значное число");
            return;
        }
        if (summAll>=10){
            int c,d;
            c=summAll/10;
            d=(summAll-c*10);
            System.out.println("Считаем числа меньше 100 "+c+" "+d);
            int result=c+d;
            System.out.println("Сумма двухзначного числа " +result);
            System.out.println("Посчитать двух значное число");
            return;
        }
        if (summAll<10){
            int d=summAll;
            System.out.println("Считаем числа меньше 100 "+d);
            int result=d;
            System.out.println("Сумма двухзначного числа " +result);
            System.out.println("посчитать однозначное число");
            return;
        }
    }
}

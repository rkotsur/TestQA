package Hill;

import java.util.Scanner;

/**
 * Created by 1 on 09.08.2016.
 */
public class Season {
    public static void main (String [] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Ведите месяц числом");
        int month=s.nextInt();
        if (month==1||month==2||month==12){
            System.out.println("Время года ЗИМА");
            return;
        }
        if (month==3||month==4||month==5){
            System.out.println("Время года ВЕСНА");
            return;

    }
        if (month==6||month==7||month==8){
            System.out.println("Время года ЛЕТО");
        }
        if (month==9||month==10||month==11){
            System.out.println("Время года ОСЕНЬ");
        }
        if(month<=0||month>12){
            System.out.println("Такого месяца не существует");
        }
}
}

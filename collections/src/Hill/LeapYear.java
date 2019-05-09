package Hill;

import java.util.Scanner;

/**
 * Created by 1 on 09.08.2016.
 */
public class LeapYear {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите год");
        int year=s.nextInt();
        if (year%4==0){if (year%100==0){
                        if (year==400||year==2000){
                            System.out.println("Год "+year+" высокосный");
                            return;
                        }
            else{
                            System.out.println("Год "+year+" не высокосный");
                            return;
                        }
        }
            System.out.println("Год " +year+" высокосный");
        }
        else {
            System.out.println("Год "+year+" не высокосный");
        }
    }

}

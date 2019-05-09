package HAG.RKotsurLesson13;

import java.util.Scanner;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask3 {
    public static void main(String[] args) {
        task3();

    }
    public static void task3(){
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        year= scanner.nextInt();
        if (year%100==0){
            if (year%400==0){
                System.out.println("Год высокосный "+year);
            }else System.out.println("Год не высокосный "+year);
        }else if(year%4==0){System.out.println("Год высокосный "+year);

        }else System.out.println("Год не высокосный "+year);
    }

}

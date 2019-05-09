package Hill;

import java.util.Scanner;

/**
 * Created by 1 on 10.08.2016.
 */
public class CubeSq {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int count1, count2;
        System.out.println("Введите начало интервала");
        count1= s.nextInt();
        System.out.println("Введите конец интервала");
        count2=s.nextInt();
        for (; count1<=count2; count1++){
            System.out.println(count1+" " +(count1*count1)+" "+ (count1*count1*count1));
        }

    }
}

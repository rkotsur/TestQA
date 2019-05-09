package Hill;

import java.util.Scanner;

/**
 * Created by 1 on 09.08.2016.
 */
public class Years {
    public static void main (String []args){
        Scanner s =new Scanner(System.in);
        int years;
        do {
            System.out.println("Введите число лет ");
            years = s.nextInt();

        }while((years<1)||(years>150));
        if (years==1){
            System.out.println("Вам "+years+" год");
            return;
        }
        if (years>1&&years<5){
            System.out.println("Вам "+years+" года");
            return;

        }
        if (years>4&&years<21){
            System.out.println("Вам "+years+" лет");
            return;

        }
        if ((years%10)>0&&(years%10)<5){
            System.out.println("Вам "+ years+" года");
            return;
        }
        if (((years%10)>4&&(years%10)<=9)||(years%10)==0){
            System.out.println("Вам "+ years+" лет");
            return;
        }
    }
}

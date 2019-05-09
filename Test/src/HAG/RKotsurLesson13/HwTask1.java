package HAG.RKotsurLesson13;

import java.util.Scanner;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask1 {
    public static void main(String[] args) {
        task1();
    }
    public static void task1(){
        Scanner scanner = new Scanner(System.in);
        int x,y,z;
        System.out.println("Введите первый номер: ");
        x=scanner.nextInt();
        System.out.println("Введите второй номер: ");
        y=scanner.nextInt();
        System.out.println("Введите третий номер: ");
        z=scanner.nextInt();
        int min=0;
        if ((x<y)&&(x<z)){
            min=x;}
        if ((y<x)&&(y<z)){
            min=y;
        }
        if ((z<x)&&(z<y)){
            min=z;
        }
        System.out.println("Наименьшее значение - "+min);
    }
}

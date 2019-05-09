package HAG.old;

import java.util.Scanner;

/**
 * Created by 1 on 20.12.2018.
 */
public class Lesson7 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        // task8();
        //task9();
        //task10();
        //task11();
        //task12_13();
        task14();
    }

    public static void task1() {
        int getNmber;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число");
            getNmber = scanner.nextInt();
        } while (!(getNmber > 0));
        while (getNmber != 0) {
            count++;
            getNmber = getNmber / 10;
        }
        System.out.println("Количество цифр в числе " + count);
    }

    public static void task2() {

        int number = 7;
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * " + number + " = " + i * number);
        }
    }

    public static void task3() {

        int number = 9;
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " * " + number + " = " + i * number);
        }
    }

    public static void task4() {
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число");
            number = scanner.nextInt();
        } while (!((number > 0) && (number < 10)));
        for (int x = 1; x <= 10; x++) {
            System.out.println(x + " * " + number + " = " + x * number);
        }
    }

    public static void task5() {
        int x = 7;
        while (x <= 98) {
            System.out.print(x + " ");
            x = x + 7;
        }
    }

    public static void task6() {
        int x = 1;
        while (x <= 512) {
            System.out.print(x + " ");
            x = x * 2;
        }
    }

    public static void task7() {
        long x = 8;
        for (int i = 9; i <= 15; i++) {
            x = x * i;
            // System.out.print(x+" ");
        }
        System.out.println(x);
        long a;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число от 1 до 20");
            a = scanner.nextInt();
        } while (!((a >= 1) && (a <= 20)));
        for (int y = (int) (a + 1); y <= 20; y++) {
            a = a * y;
        }
        System.out.println(a);


        int i1 = 1;
        int b;
        long result = 1;
        do {
            System.out.println("Введите чсло от 1 до 20 ййй");
            b = scanner.nextInt();
        } while (!((b <= 1) && (b <= 20)));
        for (int ii1 = i1; ii1 <= b; ii1++) {
            result = result * ii1;
        }
        System.out.println(result);


    }

    public static void task8() {
        int x, y, summ = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите числа х");
            x = scanner.nextInt();
            System.out.println("Введите числа y");
            y = scanner.nextInt();
        } while (!((x > 0) && (y > 0)));

        for (int i = 1; i <= y; i++) {
            summ = summ + x;
        }
        System.out.println(summ);


    }

    public static void task9() {

        int x;
        int y = 10;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число");
            x = scanner.nextInt();
        } while (!((x > 0)));

        while (x > y) {

            y = y * 10;
            //  System.out.println(y +" "+x );

        }
        while (x > 10) {
            y = y / 10;
            //System.out.println(y);
            int z = x / y;
            System.out.print(z + " ");
            x = x - y * z;
            //System.out.println(x + " " + y);

        }
        System.out.println(x);

    }

    public static void task10() {

        int x;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число");
            x = scanner.nextInt();
        } while (!((x > 0)));
        //System.out.println(x-x/10);
        while (!(x % 10 == 0)) {
            System.out.print(x % 10);
            x = x / 10;

            if (x < 10) {
                break;
            }
        }
        //System.out.println(x/(x/10)+" qqq");
        //System.out.println(x+x % 10);
        System.out.println(x % 10);
    }

    public static void task11() {
        int x;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число из ряда чисел 1, 4, 7, 10, 13 ");
            x = scanner.nextInt();
        } while (!(x > 0));
        while (!(x == 1)) {
            x = x - 3;
            System.out.print(x + " ");
        }

    }

    public static void task12_13() {

        int x;
        int maxY;
        int minY;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число");
            x = scanner.nextInt();
        } while (!((x > 0)));
        maxY=x%10;
        minY=x%10;
        while (!(x % 10 == 0)) {
            //System.out.print(x % 10);
            if (maxY<x%10){
                maxY=x%10;
            }
            if (minY>x%10){
                minY=x%10;
            }
            x = x / 10;


            if (x < 10) {
                 break;

            }
        }
        if (maxY<x%10){
            maxY=x%10;
        }
        if (minY>x%10){
            minY=x%10;
        }

        System.out.println("Максимальное число= "+maxY+" Минимальное число = "+minY);
        System.out.println("Максимальная цифра превышает минимальную на "+(maxY- minY));
    }
    public static  void task14(){
        int number=101;
        int count =0;
        for (int i=100;i<number;i++){
            number++;
            if (i%19==0){
                count++;
                System.out.println("Количество "+count+". число делиться на 19 на цело "+i);
            }
            if(count==15){
                break;
            }
        }

    }

}






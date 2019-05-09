package HAG.old;

import java.util.Scanner;

/**
 * Created by 1 on 17.12.2018.
 */
public class Lesson6 {
    public static void main(String[] args) {
        //homeWork12();
        //homeWork3();
        // homeWork4();
        //homeWork5();
        //homeWork6();
        //homeWork7a();
        //homeWork7b();
        //homeWork7c();
        //homeWork7d();
        //homeWork8();
        //homeWork9()!!!! Делал не стал это копировать.
        homeWork10();
    }

    public static void homeWork12() {
        String s;
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ для повтора");
        s = scanner.nextLine();
        System.out.println("Введите количество повторов");
        i = scanner.nextInt();
        for (int i1 = 0; i1 < i; i1++) {
            System.out.print(s + " ");
        }
        scanner.close();
    }

    public static void homeWork3() {
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ для повтора");
        s = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.print(s + " ");
            if (i == 4) {
                System.out.println();
            }
        }
    }

    public static void homeWork4() {
        char c = '+';
        int y = 0;
        for (int i = 0; i < 10; i++) {
            y++;
            System.out.println();
            for (int i1 = 0; i1 < y; i1++) {
                System.out.print(c);
            }
        }
    }

    public static void homeWork5() {
        float price = 24.5f;
        float all = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Количество " + i + " цена " + (i * price) + " грн.");
        }
    }

    public static void homeWork6() {
        double dollar;
        int count;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Курс $");
        dollar = scanner.nextDouble();
        System.out.println("Количество $");
        count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.println(i + " $ = " + (float) (dollar * i) + " грн.");
        }
        scanner.close();
    }

    public static void homeWork7a() {
        int sum = 0;
        for (int i = 100; i <= 500; i++) {
            sum = sum + i;
            //System.out.println(i+" "+sum);
        }
        System.out.println(sum);
    }

    public static void homeWork7b() {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 500");
        count = scanner.nextInt();

        for (int i = count; count <= 500; count++) {
            sum = sum + count;
            System.out.println(count + " " + sum);
        }
        System.out.println(sum);
    }

    public static void homeWork7c() {
        int a, b;
        int summ = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число а");
            a = scanner.nextInt();
            System.out.println("Введите число b");
            b = scanner.nextInt();
            if (a >= b) System.out.println("Число а должно быть больше b");
        } while (a >= b);
        System.out.println("bbbb");
        for (int x = a; x <= b; x++) {
            if (x % 2 == 0) {
                summ = summ + x;
                //System.out.println(x+ " "+a+" "+b+" " +summ);
            }
        }
        System.out.println("Сумма от a до b = " + summ);
        scanner.close();

    }

    public static void homeWork7d() {
        int a, b;
        int summ = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число а");
            a = scanner.nextInt();
            System.out.println("Введите число b");
            b = scanner.nextInt();
            if (a <= b) System.out.println("Число а должно быть больше b>=100");
            // System.out.println((a>=b)+" "+(b<=100));
        } while ((a <= b) && (b <= 100));
        //System.out.println("Выпал");
        for (int x = a; x <= b; x++) {
            summ = summ + x;
            System.out.println("summ = " + summ + " x =" + x);

        }
        summ = summ / 2;
        System.out.println("Среднее арифметическое = " + summ);

    }

    public static void homeWork8() {
        int a, b;
        int summ = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите х");
        a=scanner.nextInt();
        System.out.println("Введите y");
        b=scanner.nextInt();
        for (int x=1;b>=x;x++){
            summ=summ+a;
           // System.out.println(x+" "+b+" "+a+" "+summ);
        }
        System.out.println(summ);


    }

    public static void homeWork10() {
        int a;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Сколько элементов чисел Фибоначи вывести");
        a=scanner.nextInt();
        int [] fibon= new int [a];
        fibon[0]=0;
        fibon[1]=1;
        for (int x=2;x<a;x++){
            fibon[x]=fibon[x-1]+fibon[x-2];
        }
        for (int x=0;x<a;x++){
            System.out.print(fibon[x]+" ");
        }

    }
}
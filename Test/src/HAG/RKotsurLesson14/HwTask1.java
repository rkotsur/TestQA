package HAG.RKotsurLesson14;

import java.util.Scanner;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask1 {
    public static void main(String[] args) {
        calc();
    }

    public static void calc() {
        int num1, num2;
        String work;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        num1=scanner.nextInt();
        System.out.println("Введите символ действия " +"+ "+ "- "+"* "+"/");
        work = scanner.next();
        System.out.println("Введите второе число");
        num2=scanner.nextInt();


        if (work.equals("+")) {
            int plus=plus(num1, num2);
            System.out.println("Результат "+plus);
        }
        if (work.equals("-")) {
            int plus=minus(num1,num2);
            System.out.println("Результат "+plus);
        }
        if (work.equals("*")) {
            int plus=multiply(num1,num2);
            System.out.println("Результат "+plus);
        }
        if (work.equals("/")) {
            int plus=share(num1,num2);
            System.out.println("Результат "+plus);
        }

    }

    public static int plus(int x, int y) {
        return x + y;
    }

    public static int minus(int x, int y) {
        return x - y;

    }
    public static int multiply (int x,int y){
        return x*y;
}
    public static int share(int x,int y){
        return x/y;
    }
}
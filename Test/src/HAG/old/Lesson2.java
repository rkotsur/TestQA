package HAG.old;

import java.util.Scanner;

/**
 * Created by 1 on 05.12.2018.
 */
public class Lesson2 {
    public static void main(String[] args) {
    //resultMethod();
        //square();
        //diametr();
        //numberCount();
        fourTask();

    }
    public static void resultMethod(){
        int resultY, resultX;
        int resultXX, resultA;
        System.out.println("Введите х ");
        Scanner scanner= new Scanner(System.in);
        resultX=scanner.nextInt();
        System.out.println("Введите a ");
        resultA=scanner.nextInt();
        resultY=7*resultX*resultX-3*resultX+6;
        resultXX=12*resultA*resultA*resultA+7*resultA-16;
        System.out.println("Результат уравнений "+resultY +" "+resultXX);
        scanner.close();
    }
    public static void square(){
        int lengSquare, area;
        System.out.println("Введите длинну стороны квадрата");
        Scanner scanner = new Scanner(System.in);
        lengSquare=scanner.nextInt();
        area=lengSquare*lengSquare;
        System.out.println("Площадь квадрата = "+area);
        scanner.close();

    }
    public static void diametr(){
        int radius, diametrC;
        System.out.println("Введите радиус");
        Scanner scanner = new Scanner(System.in);
        radius=scanner.nextInt();
        diametrC=radius*2;
        System.out.println("Диаметр = "+diametrC);
        scanner.close();
    }
    public static void numberCount(){
        int secondNumber, firstNumber;
        int numberSet;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2-х значное число");
        numberSet=scanner.nextInt();
        secondNumber=numberSet/10;
        firstNumber=numberSet%10;
        System.out.println("Число десятков "+secondNumber);
        System.out.println("Число едениц "+firstNumber);
        System.out.println("Сумма цифр "+(+secondNumber+firstNumber));
        System.out.println("Произведение чисел "+secondNumber*firstNumber);
        scanner.close();
    }
    public static void fourTask(){
        System.out.println("Введите результат чисел");
        int fourTask;
        Scanner scanner=new Scanner(System.in);
        fourTask=scanner.nextInt();
        int foundTask;
        int lastNumber=fourTask%10;
        System.out.println("lastNumber "+lastNumber);
        int secondNumber=fourTask/10;
        System.out.println("secondNumber "+secondNumber);
        foundTask=(lastNumber*100)+secondNumber;
        System.out.println("Find number "+foundTask);
        scanner.close();
    }
}

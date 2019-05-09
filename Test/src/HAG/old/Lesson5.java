package HAG.old;

import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;

import java.util.Scanner;

/**
 * Created by 1 on 15.12.2018.
 */
public class Lesson5 {
    public static void main(String[] args) {
        //classWork332();
        //ifElse1();
        //ifElse2();
        // ifElse3();
        //ifElse4();
        // ifElse5();
        //ifElse6();
        //ifElse7();
        //ifElse8();
        //ifElse9();
        //homeSwitch1();
       // homeSwitch2();
       homeSwitch3();
    }

    public static void classWork332() {
        float getX, getY;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кординаты Х");
        getX = scanner.nextFloat();
        System.out.println("Введите кординаты Y");
        getY = scanner.nextFloat();
        if ((getX < -2) && (getY > 1)) {
            System.out.println("Точка попадает в область а)");
        }
        if ((getX > -2) && (getX < 1.5)) {
            System.out.println("Точка попадает в область б)");
        }
        if (((getX > 2) && (getY > 0)) || ((getX > 1) && (getY < -1))) {
            System.out.println("Точка попадает в область в)");
        }

        if ((getX >= 1) && (getY <= 4) && (getY >= 2)) {
            System.out.println("Точка попадает в область г)");
        }
        if (((getX >= 2) && (getY >= 1)) || ((getX >= 2) && (getY <= 1.5))) {
            System.out.println("Точка попадает в область е)");
        }


    }

    public static void ifElse1() {
        int getNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число");
        getNumber = scanner.nextInt();
        if (getNumber % 2 == 0) System.out.println("Число четное");
        else System.out.println("Число не четное");
        if (getNumber % 10 == 7) System.out.println("Число заканчивается на 7");
        else System.out.println("Число не заканчивается на 7");
        scanner.close();
    }

    public static void ifElse2() {
        int getNumber;
        int first, second;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2-х значное число");
        getNumber = scanner.nextInt();
        first = getNumber / 10;
        second = getNumber % 10;
        if (first == second) {
            System.out.println("Числа одинаковые " + first + " " + second);
        } else {
            if (first > second) {
                System.out.println("Первая больше второй " + first + " " + second);
            } else System.out.println("Вторая больше первой " + second + " " + first);

        }
    }

    public static void ifElse3() {
        int getNumber;
        int first, second;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2-х значное число");
        getNumber = scanner.nextInt();
        first = getNumber / 10;
        second = getNumber % 10;
        if ((first + second) >= 10) {
            System.out.println("Сумма цифр является двузначным числом");
        } else System.out.println("Сумма цифр не является двузначным числом");
        if ((first + second) >= getNumber) {
            System.out.println("Сумма цифр больше самого числа :))");
        } else {
            System.out.println("Сумма цифр меньше самого числа");
        }
        scanner.close();
    }

    public static void ifElse4() {
        int getNumber;
        int hundred, decimal, one;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3-х значное число");
        getNumber = scanner.nextInt();
        hundred = getNumber / 100;
        decimal = getNumber / 10 % 10;
        one = getNumber % 10;
        System.out.println(hundred + " " + decimal + " " + one);
        if (hundred > one) System.out.println("Первая цифра больше последнего " + hundred + " " + one);
        else System.out.println("Последняя цифра больше первого " + one + " " + hundred);
        if (hundred > decimal) System.out.println("Первая цифра больше второго " + hundred + " " + decimal);
        else System.out.println("Второе число больше первого " + decimal + " " + hundred);
        if (decimal > one) System.out.println("Вторая цифра больше последней " + decimal + " " + one);
        else System.out.println("Последня цифра больше второй " + one + " " + decimal);
    }

    public static void ifElse5() {
        int getNumber;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите трехзначное число ");
            getNumber = scanner.nextInt();
            //  System.out.println((getNumber<-999)+" " +(getNumber>1000));
            //    System.out.println((getNumber>=1000)+" "+(getNumber<=-1000));

        } while ((getNumber >= 1000) || (getNumber <= -1000));
        //  System.out.println((getNumber <= 100) + " " + (getNumber >= 10)+" "+(getNumber >=- 99) + " " + (getNumber <=- 10));
        if (getNumber == 0) {
            System.out.println("0 он и в Африке 0");
        } else if (getNumber >= 100 || getNumber <= -100) {
            System.out.println("Трехзначное число " + getNumber);
        } else if (((getNumber <= 99) && (getNumber >= 10)) ||
                ((getNumber >= -99) && (getNumber <= -10))) {
            System.out.println("Двухзначное число " + getNumber);
        } else System.out.println("Однозначное число " + getNumber);
        if (0 == getNumber) {
            System.out.println("Знак не определяется " + getNumber);
        } else {
            if (getNumber > 0) {
                System.out.println("Положительное число");
            } else {
                System.out.println("Отритцательное");
            }
        }
        scanner.close();
    }

    public static void ifElse6() {
        int getYear;
        int year = 365;
        int maxYear = 366;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите год");
            getYear = scanner.nextInt();

        } while ((getYear <= 0));
        System.out.println((getYear >= 400) + " " + (getYear % 400 == 0));

        if (getYear % 100 == 0) {
            System.out.println("Столетие " + getYear);
            if ((getYear < 400) && (getYear % 100 == 0)) {
                System.out.println("Высокосный год " + getYear + " дней в году " + maxYear);
            } else if ((getYear >= 400) && (getYear % 400 == 0)) {
                System.out.println("Высокосный год " + getYear + " дней в году " + maxYear);

            } else {
                System.out.println("Не высокосный" + getYear + " дней в году " + year);
            }

        } else {
            if (getYear % 4 == 0) {
                System.out.println("Высокосный год " + getYear + " дней в году " + maxYear);
            } else System.out.println("Не высокосный год " + getYear + " дней в году " + year);
        }


    }

    public static void ifElse7() {
        int getNum;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число 0 до 100");
            getNum = scanner.nextInt();
            //System.out.println((getNum<0)+" "+(getNum>100));
        } while ((getNum < 0) || (getNum > 100));

        if ((getNum >= 0) && (getNum < 25)) {
            System.out.println("Отрезок A - [0; 25)" + getNum);
        }
        if ((getNum >= 25) && (getNum < 50)) {
            System.out.println("Отрезок B – [25; 50)" + getNum);
        }
        if ((getNum >= 50) && (getNum < 75)) {
            System.out.println("Отрезок C – [50; 75)" + getNum);
        }
        if ((getNum >= 75) && (getNum <= 100)) {
            System.out.println("Отрезок D – [75; 100] " + getNum);
        }
    }

    public static void ifElse8() {
        int getNum;
        int hundred, decimal, one;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введиет 3-х занчное число");
            getNum = scanner.nextInt();
            // System.out.println((getNum < 100) + " " + (getNum < 1000));
        } while ((getNum < 100) || (getNum > 999));
        hundred = getNum / 100;
        decimal = getNum / 10 % 10;
        one = getNum % 100 % 10;
        System.out.println(hundred + " " + decimal + " " + one);
        scanner.close();
        if ((one == decimal) && (hundred == decimal)) {
            System.out.println("Все числа одинаковые");
        } else {
            if (one == hundred) {
                System.out.println("Еденицы и сотни одинаковые");
            } else if (one == decimal) {
                System.out.println("Единицы и десятки одинаковые");
            } else if (decimal == hundred) {
                System.out.println("Десятки и сотни одтнаковые");
            } else System.out.println("Числа все в числе разные");
        }
    }

    public static void ifElse9() {
        int getNum1, getNum2, getNum3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        getNum1 = scanner.nextInt();
        System.out.println("Введите второе число");
        getNum2 = scanner.nextInt();
        System.out.println("Введите третье число");
        getNum3 = scanner.nextInt();
        scanner.close();
        if (getNum1 % 2 == 0) {
            System.out.println("Первое число четное " + getNum1);
            if (getNum2 % 2 == 0) {
                System.out.println("Второе число четное " + getNum2);
            }
            if (getNum3 % 2 == 0) {
                System.out.println("Третье число четное " + getNum3);
            }
        }
    }

    public static void homeSwitch1() {
        int day;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число от 1 до 7");
            day = scanner.nextInt();

            //System.out.println((day<0)+" "+(day>7));
        } while ((day < 1) || (day > 7));
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                break;
        }
        scanner.close();


    }

    public static void homeSwitch2() {
        int month;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число от 1 до 12");
            month = scanner.nextInt();

            //System.out.println((day<0)+" "+(day>7));
        } while ((month < 1) || (month > 12));
        switch (month) {
            case 1:
                System.out.println("Январь 31");
                break;
            case 2:
                System.out.println("Февраль 28");
                break;
            case 3:
                System.out.println("Март 31");
                break;
            case 4:
                System.out.println("Апрель 30");
                break;
            case 5:
                System.out.println("Май 31");
                break;
            case 6:
                System.out.println("Июнь 30");
                break;
            case 7:
                System.out.println("Июль 31");
                break;
            case 8:
                System.out.println("Август 31");
                break;
            case 9:
                System.out.println("Сентябрь 30");
                break;
            case 10:
                System.out.println("Октябрь 31");
                break;
            case 11:
                System.out.println("Ноябрь 30");
                break;
            case 12:
                System.out.println("Декабрь 31");
                break;
            default:
                break;
        }
        scanner.close();
    }

    public static void homeSwitch3() {
        int day;
        //int month;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число от 1 до 365");
            day = scanner.nextInt();

            //System.out.println((day<0)+" "+(day>365));
        } while ((day < 1) || (day > 365));
        if ((day > 0) && (day < 31)) {
            System.out.println("Январь");

        }
        if ((day > 31) && (day < 59)) {
            System.out.println("Февраль");

        }
        if ((day > 59) && (day < 90)) {
            System.out.println("Март");

        }
        if ((day > 90) && (day < 120)) {
            System.out.println("Апрель");

        }
        if ((day > 120) && (day < 151)) {
            System.out.println("Май");

        }
        if ((day > 151) && (day < 181)) {
            System.out.println("Июнь");

        }
        if ((day > 181) && (day < 212)) {
            System.out.println("Июль");

        }
        if ((day > 212) && (day < 243)) {
            System.out.println("Август");

        }
        if ((day > 243) && (day < 273)) {
            System.out.println("Сентябрь");

        }
        if ((day > 273) && (day < 304)) {
            System.out.println("Октябрь");

        }
        if ((day > 304) && (day < 334)) {
            System.out.println("Ноябрь");

        }
        if ((day > 334) && (day < 365)) {
            System.out.println("Декабрь");

        }
        scanner.close();
    }
}







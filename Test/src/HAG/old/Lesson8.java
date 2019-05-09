package HAG.old;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by 1 on 25.12.2018.
 */
public class Lesson8 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6_7();
        //task8();
        //task9();
        //task10();
        //task11();
        //task12();
        //task13();
        homeWork8_1();
        homeWork8_2();
        homeWork8_4();
    }

    public static void task1() {
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void task2() {
        int number = 1;
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = number;
            number++;
        }

        for (int i : arr
                ) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    public static void task3() {
        Random random = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);

        }
        System.out.println("Начальный масив");
        for (int i : arr
                ) {
            System.out.print(i + " ");

        }
        int temp = 0;
        int lengthArr = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[lengthArr];
            arr[lengthArr] = temp;
            lengthArr--;
        }
        System.out.println("\nИзмененный масив");
        for (int i : arr
                ) {
            System.out.print(i + " ");
        }


    }

    public static void task4() {
        int arr[] = new int[10];
        Random random = new Random();
        int i = 0;
        while (i < 10) {
            int arrArgs = random.nextInt(50);
            if (arrArgs > 10) {
                arr[i] = arrArgs;
                i++;
            }

        }
        for (int x = 0; x < arr.length; x++) {
            if (x == 0) System.out.print("Массив данных ");
            System.out.print(arr[x] + " ");
        }

    }

    public static void task5() {
        int countArgsArr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов масива");
        int arr[] = new int[scanner.nextInt()];
        Random random = new Random();
        for (int x = 0; x < arr.length; x++) {
            arr[x] = random.nextInt(100);
            System.out.print(arr[x] + " ");
        }
        System.out.println("\nВсе элементы умножены на 2");
        for (int x = 0; x < arr.length; x++) {
            arr[x] *= 2;
            System.out.print(arr[x] + " ");
        }
        System.out.println("\nВсе элементы умножены на последний элемент = " + arr[arr.length - 1]);
        for (int x = 0; x < arr.length; x++) {
            arr[x] *= arr[arr.length - 1];
            System.out.print(arr[x] + " ");
        }


    }

    public static void task6_7() {
        int arr[] = new int[10];

        Random random = new Random();
        System.out.println("Mассив ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        int maxArr = arr[0];
        int minArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxArr < arr[i]) {
                maxArr = arr[i];
            }
            if (minArr > arr[i]) {
                minArr = arr[i];
            }

        }
        System.out.println("\nНаибольшее значение массива " + maxArr + " наименьшее значение " + minArr);
        System.out.println("Массив в обратном порядке");
        for (int x = (arr.length - 1); x >= 0; x--) {
            System.out.print(arr[x] + " ");

        }
    }

    public static void task8() {
        int summ = 0;
        int arr[] = new int[10];
        int i = 0;
        Random random = new Random();
        while (i < arr.length) {
            int value = random.nextInt(100);
            if (value > 10) {
                arr[i] = value;
                i++;
                summ += value;
            }
        }
        System.out.println("Массив");
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1] + " ");

        }
        System.out.println("\nСумма всех элементов массива " + summ);

    }

    public static void task9() {
        int arr[] = new int[10];
        int minArrvalue = 0;
        int arrIndex = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (random.nextInt(20) - 10);
            if (i == 0) {
                minArrvalue = arr[i];
            }
            if (minArrvalue > arr[i]) {
                minArrvalue = arr[i];
                arrIndex = i;
            }
        }
        for (int x : arr
                ) {
            System.out.print(x + "  ");


        }
        System.out.println("\nМинимальное значение масива = " + minArrvalue + ", индекс элемента " + arrIndex);
    }

    public static void task10() {
        int arr[] = new int[10];
        int minusElem = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (random.nextInt(21) - 10);
            if (arr[i] < 0) {
                minusElem++;

            }
        }
        System.out.println("Количество отритцательных чисел: " + minusElem);
        System.out.print("Индексы чисел ");
        for (int i = 0; i < arr.length; i++) {
            if (0 > arr[i]) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\n");
        for (int x : arr
                ) {
            System.out.print(x + "  ");
        }

    }

    public static void task11() {
        int[] arr = new int[10];
        int plusSign = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (random.nextInt(31) - 20);
            if (arr[i] > 0) {
                plusSign++;
            }
        }
        for (int i : arr
                ) {
            System.out.print(i + " ");
        }
        System.out.print("\n Количество положительных элементов " + plusSign + "\n Индексы чисел в массиве: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(i + ", ");
            }
        }


    }

    public static void task12() {
        int arr[] = new int[10];
        int value = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
            if (arr[i] == 5) {
                value++;
            }
        }
        System.out.println("\n Число 5 встречается " + value);

    }

    public static void task13() {
        int arr[] = new int[10];
        int arr1[] = new int[10];
        Random random = new Random();
        System.out.println("Первый массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
            arr1[i] = arr[i] * 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nВторой массив увеличеный в 2 раза");
        for (int x : arr1
                ) {
            System.out.print(x + " ");
        }

    }

    public static void homeWork8_1() {
        int x = 5;
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 6; i1++) {
                System.out.print(5);
                for (int i2 = 0; i2 < 5; i2++) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //************************
        for (int i = 0; i < 4; i++) {
            int q = 1;

            for (int i1 = 0; i1 < 10; i1++) {
                System.out.print(q);
                q++;
                for (int i2 = 0; i2 < 5; i2++) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
        //************************
        int q = 41;
        for (int i = 0; i < 4; i++) {

            for (int i1 = 0; i1 < 10; i1++) {
                System.out.print(q);
                q++;
                for (int i2 = 0; i2 < 5; i2++) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }

    public static void homeWork8_2() {
        int i = 5;
        for (int i1 = 0; i1 < 6; i1++) {
            for (int i2 = 0; i2 < i1; i2++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println("qqqq");
        //**********************
        i = 1;
        for (int i1 = 5; i1 > 0; i1--) {
            for (int i2 = 0; i2 < i1; i2++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    //*************************************
    public static void homeWork8_4() {
        for (int i1 = 0; i1 < 5; i1++) {
            for (int i2 = i1; i2 <= i1; i2--) {
                if (i2 == 0) {
                    System.out.print(i2 + "\t");
                    break;
                }
                System.out.print(i2 + "\t");
            }
            System.out.println("");
        }

        //******************************************
        System.out.println("qqq");
        for (int i1 = 6; i1 >= 2; i1--) {
            for (int i2 = i1; i2 <= i1; i2--) {
                if (i2 == 2) {
                    System.out.print(i2 + "\t");
                    break;
                }
                System.out.print(i2 + "\t");
            }
            System.out.println("");
        }
    }
}




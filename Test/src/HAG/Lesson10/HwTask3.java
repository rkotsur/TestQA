package HAG.Lesson10;

import java.util.Random;

/**
 * Created by 1 on 25.01.2019.
 */
public class HwTask3 {
    static int [][]arrDouble = new int[5][6];
    public static void main(String[] args) {
        task();
    }

    public static void task(){
        Random random = new Random();
        for (int i=0;i<arrDouble.length;i++){
            for (int i1=0; i1<arrDouble[0].length;i1++){
                arrDouble[i][i1]=random.nextInt(99);
            }
        }
        for (int i=0;i<arrDouble.length;i++){
            for (int i1=0; i1<arrDouble[0].length;i1++){
                System.out.print(arrDouble[i][i1]+"  ");
            }
            System.out.println();
        }
        System.out.println(arrDouble[0][arrDouble[0].length-1]);
        System.out.println(arrDouble[arrDouble.length-1][arrDouble[0].length-1]);
        if ((arrDouble[0][arrDouble[0].length-1])>(arrDouble[arrDouble.length-1][arrDouble[0].length-1])){
            System.out.println("Верхний правый больше");
        }else{
            System.out.println("Нижний правый больше");
        }
        System.out.println(arrDouble[0][0]);
        System.out.println(arrDouble[arrDouble.length-1][0]);
        if (arrDouble[0][0]%10==5){
            System.out.println("Верхнее число оканчивается цифрой 5");
        }else System.out.println("Верхнее число не оканчивается цифрой 5");
        if (arrDouble[arrDouble.length-1][0]%10==5){
            System.out.println("Нижнее число оканчивается цифрой 5");
        }else System.out.println("Нижнее число не оканчивается цифрой 5");

    }

}

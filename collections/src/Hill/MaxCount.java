package Hill;

import java.util.Scanner;

/**
 * Created by 1 on 09.08.2016.2
 */
public class MaxCount {
    public static void main (String []args){
        Scanner s= new Scanner (System.in);
        System.out.println("Введите количество чисел ");
        int counts= s.nextInt();
        int[] countsArray = new int[counts];
        System.out.println(countsArray.length);
        int maxCount;
        for (int a=0;a<countsArray.length;a++){
            System.out.println("Введите число " +(a+1));
            countsArray[a]=s.nextInt();

        }
        maxCount=countsArray[0];
        for (int a=1; a<countsArray.length; a++){
           // System.out.print(countsArray[a]+" ");
            if (maxCount<countsArray[a]){
                maxCount=countsArray[a];
            }

        }
        System.out.println("maxCount "+maxCount);

    }
}

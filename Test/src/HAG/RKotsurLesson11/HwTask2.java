package HAG.RKotsurLesson11;

import java.util.Scanner;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        int x=scanner.nextInt();
        int arrUser[] = new int[x];
        int y;
        for (int z=0;z<arrUser.length;z++) {

                System.out.println("Ведите " +(z+1)+" элемент массива");
                y = scanner.nextInt();
                arrUser[z]=y;
        }
        scanner.close();
        for (int element:
             arrUser) {
            System.out.print(element+" ");
            }

        for (int i=0; i<arrUser.length;i++){
            if (arrUser[i]%3==0){
                arrUser[i]=3;
            }
        }
        System.out.println("\n");
        for (int element:
                arrUser){
            System.out.print(element+" ");
        }
    }
}

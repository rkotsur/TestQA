package HAG.RKotsurLesson12;

import java.util.Random;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask1 {
    public static void main(String[] args) {
        int[] randArr = new int[10];
        Random random = new Random();
        int changhe;

        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = random.nextInt(100);
            System.out.print(randArr[i] + " ");
        }
        System.out.println("\n");
        for (int i = randArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (randArr[j] > randArr[j + 1]) {
                    changhe = randArr[j];
                    randArr[j] = randArr[j + 1];
                    randArr[j + 1] = changhe;
                }
            }

        }
        for (int element:
             randArr) {
            System.out.print(element+" ");

        };
    }
}

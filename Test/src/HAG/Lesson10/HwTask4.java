package HAG.Lesson10;

/**
 * Created by 1 on 25.01.2019.
 */
public class HwTask4 {
    static int[][] arrPaint = new int[7][7];

    public static void main(String[] args) {
        task();

    }

    public static void task() {
        for (int i = 0; i < arrPaint.length; i++) {
            for (int i1 = 0; i1 < arrPaint[0].length; i1++) {
                System.out.print(arrPaint[i][i1] + "  ");
                if (i == i1) {
                    arrPaint[i][i1] = 1;
                }

            }
            System.out.println();
        for (int i2=0,i3=arrPaint.length;i2<arrPaint.length;i2++,i3--){
            arrPaint[i2][i3-1]=1;
        }
        for (int i4=0;i4<arrPaint.length;i4++){
            arrPaint[arrPaint.length/2][i4]=1;
        }

        }
        System.out.println();
        for (int i = 0; i < arrPaint.length; i++) {
            for (int i1 = 0; i1 < arrPaint[0].length; i1++) {
                System.out.print(arrPaint[i][i1] + "  ");

            }
            System.out.println();
        }
    }
}
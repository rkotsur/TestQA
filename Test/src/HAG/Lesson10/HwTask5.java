package HAG.Lesson10;

/**
 * Created by 1 on 26.01.2019.
 */
public class HwTask5 {
    static int[][] arrPaint = new int[6][6];
    static int summArr = 0;

    public static void main(String[] args) {
       task();
        //summArrGet(1,1);

    }

    public static void task() {
        for (int i = 0; i < arrPaint.length; i++) {
            for (int i1 = 0; i1 < arrPaint[0].length; i1++) {
                if (i == 0) {
                    arrPaint[i][i1] = 1;
                }
                if (i1 == 0) {
                    arrPaint[i][i1] = 1;
                }
            }
        }

        for (int i2 = 1; i2 < arrPaint.length; i2++) {
            for (int i3 = 1; i3 < arrPaint[0].length; i3++) {
                summArrGet(i2, i3);
            }

        }
                System.out.println();

                for (int i6 = 0; i6 < arrPaint.length; i6++) {
                    for (int i7 = 0; i7 < arrPaint[0].length; i7++) {
                        System.out.print(arrPaint[i6][i7] + "  ");
                    }
                    System.out.println();
                }
            }


    public static void summArrGet(int x,int y){
        int yy=y;
        summArr=0;
        do{
            summArr=arrPaint[x-1][yy]+summArr;
            yy--;
        }
        while (!(yy==-1));
        arrPaint[x][y]=summArr;
        //System.out.println("\n"+arrPaint[x][y]);

    }
}

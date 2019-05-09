package HAG.Lesson10;

/**
 * Created by 1 on 20.01.2019.
 */
public class HwTask12 {
    public static void main(String[] args) {
        int [] [] arrInt= new int[5][6];
        arrInt[0][0]=1;
        arrInt[0][5]=2;
        arrInt[4][0]=3;
        arrInt[4][5]=4;

        System.out.println(arrInt.length);//Количество строк
        System.out.println(arrInt[0].length);//Количество столбцов в 0 строке
        for (int i=0; i<arrInt.length; i++){
            for (int i1=0; i1<arrInt[0].length;i1++){
                System.out.print(" "+arrInt[i][i1]);
            }
            System.out.println();
        }
    int temp=0;
        System.out.println();
        temp=arrInt[0][(arrInt[0].length-1)];
        arrInt[0][(arrInt[0].length-1)]=arrInt[arrInt.length-1][0];
        arrInt[arrInt.length-1][0]=temp;

        for (int i=0; i<arrInt.length; i++){
            for (int i1=0; i1<arrInt[0].length;i1++){
                System.out.print(" "+arrInt[i][i1]);
            }
            System.out.println();
        }
        System.out.println();
        temp=arrInt[0][0];
        arrInt[0][0]=arrInt[arrInt.length-1][arrInt[0].length-1];
        arrInt[arrInt.length-1][arrInt[0].length-1]=temp;

        for (int i=0; i<arrInt.length; i++){
            for (int i1=0; i1<arrInt[0].length;i1++){
                System.out.print(" "+arrInt[i][i1]);
            }
            System.out.println();
        }
        System.out.println(arrInt[(arrInt.length-1)][(arrInt[0].length-1)]);
        System.out.println(arrInt[(arrInt.length-1)][0]);
if (arrInt[(arrInt.length-1)][(arrInt[0].length-1)]<arrInt[(arrInt.length-1)][0]){
    System.out.println("Левый нижний элемент больше");

}else
{
    System.out.println("Правый нижний элемент больше");
}
        System.out.println(arrInt[0][0]);
        System.out.println(arrInt[0][(arrInt[0].length-1)]);
        if (arrInt[0][(arrInt[0].length-1)]<arrInt[0][0]){
            System.out.println("Левый верхний элемент больше");

        }else
        {
            System.out.println("Правый верхний элемент больше");
        }


    }

}

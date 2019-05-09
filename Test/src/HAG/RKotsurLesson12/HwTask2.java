package HAG.RKotsurLesson12;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask2 {
    public static void main(String[] args) {
        int sizeArr=0;
        for (int i=1;i<100;i++){
            if (!(i%2==0)){
                sizeArr++;
            }
        }
        System.out.println(sizeArr);
        int unevenArr[]= new int[sizeArr];
        int valueArr=0;
        for (int i=1;i<100;i++){
            if (!(i%2==0)){
                unevenArr[valueArr]=i;
                valueArr++;
            }
        }
        System.out.println("\n");
        for (int element:
             unevenArr) {
            System.out.print(element+" ");

        }
        System.out.println("\n");
        for (int i=unevenArr.length;i>0;i--){
            System.out.print(unevenArr[i-1]+" ");
        }

    }
}

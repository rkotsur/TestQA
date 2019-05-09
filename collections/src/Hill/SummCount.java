package Hill;

/**
 * Created by 1 on 10.08.2016.
 */
public class SummCount {
    public static void main (String []args){
        int summResult=0;
        int intervalSumm1=100;
        int intervalSumm2=450;

        for (int intervalCikl=intervalSumm1; intervalSumm1<=intervalSumm2;intervalSumm1=intervalSumm1+2){
            summResult=summResult+intervalSumm1;
        }
        System.out.println("Результат "+summResult+"");
    }
}

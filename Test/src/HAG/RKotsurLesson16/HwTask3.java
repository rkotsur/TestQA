package HAG.RKotsurLesson16;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask3 {
    public static void main(String[] args) {
        String s="каtк";
        System.out.println(polindrom(s));
        s="как";
        System.out.println(polindrom(s));
        s="топот";
        System.out.println(polindrom(s));
        s="авеева";
        System.out.println(polindrom(s));


    }
    public static boolean polindrom(String x){
        boolean right=false;
        for (int i=0;i<x.length()/2;i++){
            if (x.charAt(i)==(x.charAt(x.length()-1-i))){
                right=true;
            }else right=false;
        }

    return right;
    }
}

package HAG.RKotsurLesson11;

import java.lang.reflect.Array;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask1 {
    static int i;
    public static void main(String[] args) {
        String arrCar[]={"Mazda", "Opel", "Volvo", "Geely", "Buick",};
        String changhe;
        //while (arrCar[i].charAt(symboll)==arrCar[i+1].charAt(symboll)){
        for(int i = arrCar.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arrCar[j].charAt(0) > arrCar[j+1].charAt(0) ){
                changhe = arrCar[j];
                arrCar[j] = arrCar[j+1];
                arrCar[j+1] = changhe;
            }
        }
    }


        for (String ss:
             arrCar) {
            System.out.print(ss+" ");

        }
        System.out.println("\n");
        for(int i = arrCar.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arrCar[j].charAt(0) < arrCar[j+1].charAt(0) ){
                    changhe = arrCar[j];
                    arrCar[j] = arrCar[j+1];
                    arrCar[j+1] = changhe;
                }
            }
        }
        for (String ss:
                arrCar) {
            System.out.print(ss+" ");

        }
    }


}

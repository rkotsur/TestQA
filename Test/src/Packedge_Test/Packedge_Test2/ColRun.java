package Packedge_Test.Packedge_Test2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 1 on 12.03.2019.
 */
public class ColRun {
    public static void main(String[] args) {
        ArrayList <Apple> apples=  new ArrayList<>();
        for (int i = 0; i <5000000 ; i++) {
            apples.add(new Apple());
        }
      //  System.out.println("End"+Apple.x);
       // for (int i = 0; i <995500 ; i++) {
            Apple aa=apples.get(9625000);

                System.out.println(aa.getX());
            }
            }


class Apple {
     static int x;
     double y;
     Apple(){
         x++;
         y+=10;
     }
    double getX(){
        return y ;
    }
}

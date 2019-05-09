/**
 * Created by 1 on 03.10.2018.
 */
import java.util.*;
class DbData{
    int count;
    char letter;
    long number;
     protected int getReturnMethod(int x){
        int t = 0;
        return t+x;
    }
    void helloWorld(){
         System.out.println("HI PEACE");
    }
    void getDate(){
        System.out.println(new Date());
    }
}

public class NewDate {
    int count;
    char litter;

    static int getReturnInt(int y){

        return y;
    }

    public static void main(String[]args){
       DbData Db1= new DbData();
       int x=5;
        System.out.println("int "+Db1.count+" char "+Db1.letter+"  long "+Db1.number);
        System.out.println(Db1.getReturnMethod(12));
        Db1.helloWorld();
        System.out.println(getReturnInt(10));
        Db1.getDate();
        System.out.println("Char "+ (char)(x));

    }
}

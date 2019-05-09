package Extend;

/**
 * Created by 1 on 27.11.2018.
 */
public class ArgExtC extends ArgExtB{
    ArgExtC(){
        super("String");
        System.out.print("Конструктор ArgExtC ");
    }
    public static void main (String [] args){
        //new ArgExtB("QQQ");
        new ArgExtC();
    }
}

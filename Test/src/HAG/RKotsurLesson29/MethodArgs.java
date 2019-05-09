package HAG.RKotsurLesson29;

import HAG.RKotsurLesson29.Shape;

/**
 * Created by 1 on 20.02.2019.
 */
public class MethodArgs {
    int cointArgs=0;
    Shape [] args = new Shape[10];
    boolean full(){
        if (cointArgs==10){
            System.out.println("Box full");
            return false;
        }else {
            return true;
        }
    }




    void addArgs(Shape x){
    args[cointArgs]=x;
//    System.out.println("Получил обьект Shape");
//        System.out.println(args[cointArgs]);
        cointArgs++;
    }
    void allArgs(){
//        System.out.println("Попал в метод allArgs");
//        System.out.println(args.length);
        for (int i=0; i<cointArgs;i++){
            System.out.println(args[i]);//проверка

        }
    }

}

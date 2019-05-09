package HAG.RKotsurLesson29;

import java.util.Scanner;

/**
 * Created by 1 on 19.02.2019.
 */
public class Menu {
    public static void main(String[] args) {

    }

    void menuDo() {
        int valueMenu;
        MethodArgs methodArgs = new MethodArgs();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Введите блок\n" +
                "2) Введите сферу\n" +
                "3) Введите пирамиду\n" +
                "4) Показать данные\n" +
                "5) Выход\n");

        do {
            System.out.println("Введите пункт меню");
            valueMenu=scanner.nextInt();
            if (valueMenu==1&&(methodArgs.full())){

                System.out.println("Введено блок");
                Block block = new Block();
                block.intialBlock();
                block.volume();
                block.square();
                methodArgs.addArgs(block);

        }
        if (valueMenu==2&&(methodArgs.full())){

                System.out.println("Введено сфера");
                Sphere sphere = new Sphere();
            sphere.intialBlock();
            sphere.volume();
            sphere.square();
                methodArgs.addArgs(sphere);
        }
        if((valueMenu==3&&(methodArgs.full()))){
            System.out.println("Введено пирамида");
            System.out.println("Введено сфера");
            Pyramid pyramid = new Pyramid();
            pyramid.intialBlock();
            pyramid.volume();
            pyramid.square();
            methodArgs.addArgs(pyramid);
        }
        if (valueMenu==4){
            System.out.println("Вывожу данные");
            methodArgs.allArgs();
        }
        if (valueMenu==5){
            System.out.println("Вы ввели выход");
        }


        }while (!(valueMenu==5));
    }
}
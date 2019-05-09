package HAG.RKotsurLesson34;

import java.util.Scanner;

/**
 * Created by 1 on 15.03.2019.
 */
public class MenuProgram {
    void runMethod(){
        int x=0;
        Scanner scanner = new Scanner(System.in);
        do{
            x=scanner.nextInt();
            if(x==1){
            System.out.println("menu 1");
        }
        if (x==2){
            System.out.println("menu 2");
        }
        if (x==3){
            System.out.println("menu 3");
        }
        if (x==4){
            System.out.println("menu 4");
        }

        }while (!(x==5));
    }
}

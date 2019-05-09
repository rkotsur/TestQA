package HAG.RKotsurLesson34;

/**
 * Created by 1 on 15.03.2019.
 */
public class Run {
    public static void main(String[] args) {
//        MenuProgram menuProgram = new MenuProgram();
//        menuProgram.runMethod();
        work();

    }
   static void work(){
        try{
            work();
        }finally {
            work();
        }
    }
}

package HAG.RKotsurLesson16;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask1 {
    public static void main(String[] args) {
        System.out.println(task(106,16));;
    }
    public static int task(int x, int y){

            while (y !=0) {
                int tmp = x%y;
                x = y;
                y = tmp;
            }
            return x;
        }

    }


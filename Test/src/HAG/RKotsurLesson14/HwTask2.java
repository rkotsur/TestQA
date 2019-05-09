package HAG.RKotsurLesson14;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask2 {
    public static void main(String[] args) {
        System.out.println(trueFalse1(10));
        System.out.println(trueFalse1(-10));
        System.out.println(trueFalse1(0));

    }

    public static boolean trueFalse1(int x) {
        boolean status = true;
        if (x >= 0) {
            status = true;

        }
        if (x < 0) {
            status = false;

        }


        return status;
    }


}
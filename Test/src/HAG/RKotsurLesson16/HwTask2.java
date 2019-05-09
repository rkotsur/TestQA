package HAG.RKotsurLesson16;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask2 {
    public static void main(String[] args) {
        String s = "Hello world hHH. The white and blue.";
        System.out.println(hCount(s));
        ;
    }

    public static int hCount(String x) {
        int count = 0;
        char c = 'h';
        for (int i = 0; i < x.length(); i++) {
            if ((x.charAt(i) == 'h') || (x.charAt(i) == 'H')) {
                count++;
            }

        }
        return count;
    }
}
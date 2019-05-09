package HAG.RKotsurLesson34.TestCollect;

/**
 * Created by 1 on 19.03.2019.
 */
public class LambdaApp {
    public static void main(String[] args) {
        Operation operation;
        operation= (x,y)->x+y;
        int result =operation.calc(10,20);
        System.out.println(result);
    }
}
interface  Operation{
    int calc(int x, int y);
}

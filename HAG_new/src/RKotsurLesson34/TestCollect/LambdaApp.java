package RKotsurLesson34.TestCollect;

/**
 * Created by 1 on 19.03.2019.
 */
public class LambdaApp {
    public static void main(String[] args) {
        Operation operation;
        operation= ()->30+30;
        int result =operation.calc();
        System.out.println(result);

    }
}
interface  Operation{
    int calc();
}

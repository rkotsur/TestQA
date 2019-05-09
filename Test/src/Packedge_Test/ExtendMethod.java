package Packedge_Test;

/**
 * Created by 1 on 10.12.2018.
 */

class MethorOne{
    void oneInstans(int x){
        System.out.println("OneInstans int=" +x);
    }
    void oneInstans(char x){
        System.out.println("OneInstans char="+x);
    }
        }
class MethodTwo extends MethorOne{

    void oneInstans(int x, char y){
        System.out.println("OneInstans int char"+x+" "+y);
    }
    @Override
    void oneInstans(int x){
        System.out.println("Class MethodTwo.oneInstans" +x);
    }
}


public class ExtendMethod {
    public static void main(String[] args) {
        MethodTwo methodTwo = new MethodTwo();
        methodTwo.oneInstans(10);
        methodTwo.oneInstans(10,'c');
        methodTwo.oneInstans('c');
    }
}

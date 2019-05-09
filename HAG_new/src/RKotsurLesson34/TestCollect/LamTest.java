package RKotsurLesson34.TestCollect;

public interface LamTest {

    boolean doTest(int x);
}
interface LamTestInt {

    int doTestInt(int x);
}
interface LamString{

    String doLamString(String x);

}
class RunLamda{
    void do1() {
        LamTest lamTest;
        lamTest= x-> x==0;
        System.out.println(lamTest.doTest(10));
    }
}
class Run{
    public static void main(String[] args) {
        RunLamda runLamda = new RunLamda();
        runLamda.do1();
        LamTest lamTest;
        LamTestInt lamTestInt;
        lamTestInt=(x)->x;
        int c=lamTestInt.doTestInt(12);
        lamTest=(x)->true;
        System.out.println(lamTest.doTest(10));
        System.out.println(c);

        LamTestInt lamTestInt1;
        lamTestInt1=(x)->x*10;
        System.out.println(lamTestInt1.doTestInt(10));
        LamString lamString;
//        lamString= (r)->r;
//        System.out.println(lamString.doLamString("HI"));
    }
}

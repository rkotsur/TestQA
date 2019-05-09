package Hill;

class DateDB{
    boolean j;
    byte a,d;
    void proverka (boolean a,int s) {
        int c = s;
        for (c = 0; a; c++) System.out.println("Вечный цикл");
    }
    void proverka1(boolean c){
        while (c){
            System.out.println("Вечный цикл 2");
        }
    }
        void proverka3() {
        for (int i = 0; i != 10; i++) {
            System.out.println(i);
        }
        }
    }


public class Test {
    public static void main(String [] args) {
        DateDB a = new DateDB();
        DateDB b = new DateDB();
        b.j= false;
        if (b.j)
        System.out.println("j = true");
        else System.out.println("j=false");
        a.d=100;
        byte c;
        c= (byte) (a.a+a.d);
        System.out.println(a.j);
        System.out.println(b.j);
        System.out.println(a.j && b.j);
       // a.proverka(true,10);
        a.proverka3();

    }
}

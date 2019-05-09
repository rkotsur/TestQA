/**
 * Created by 1 on 09.10.2018.
 */
import Packedge_Test1.*;
import Packedge_Test.*;

import java.util.*;

class DogDb {
    int anInt;

    void cointResult() {
        Random rand = new Random();
        int random = rand.nextInt(100) % 2;
        System.out.println(random);
        boolean i;
        if (random < 1) {
            System.out.println("Орел " + random);
        } else
            System.out.println("Решка " + random);
    }

    void runFood() {
        System.out.println("Бегущая нога");
    }

    int eyse() {
        Random random = new Random();
        int glass = random.nextInt(100);
        return glass;
    }

    void anInt(String x) {
        int i = 2;
        int y;
        System.out.println(x += " Summ");
        System.out.println(y = i += 2);

    }

    void aVoid(int y) {
        int x = y;
        System.out.println(x + "" + y);
        System.out.println("anInt " + anInt);

    }

    void trueMethod(int x, int y) {

        if (x == y) {
            System.out.println("x=" + x + " x и y равны между собой" + " y=" + y);
        } else if (x > y) {
            System.out.println("x=" + x + " x больше y" + " y=" + y);

        } else System.out.println("x=" + x + " x меньше y" + " y=" + y);
    }

    void up100(int x) {
        int i = x;
        do {
            System.out.println(" i " + i);
            i++;
        } while (i <= 100);
    }

    void diferentCount(int x) {
        Random r1 = new Random();
        Random r2 = new Random();
        for (int y = 1; y <= x; x++) {
            int i = r1.nextInt(100);
            int i1 = r2.nextInt(100);
            System.out.println(i + " " + i1);
            if (i == i1) {
                System.out.println(i + " i равно i1 " + i1);
            } else if (i < i1) {
                System.out.println(i + " меньше " + i1);
            } else System.out.println(i + " больше " + i1);
        }


    }

    void prostNumber(int y) {
        for (int x = 1; x <= y; x++) {

            System.out.println(x);


        }
    }

    void deleteNumber(int x, int y) {
        System.out.print(x % y);

    }

    void naturNumber(int x) {
        int z = 0;
        if (x == 1) {
            System.out.println(" Число " + x + " простое");

        } else if (x == 2) {
            System.out.println(" Число " + x + " простое");
        } else for (int y = 2; y < x; y++) {
            z = x % y;
            if (z == 0) {
                break;
            }
        }
        if (z == 1)
            System.out.println(" Число " + x + " простое");

    }

    void naturNumberCounter(int x) {
        for (int y = 0; y <= x; y++) {
            naturNumber(y);
        }


    }

    void forEach() {
        Random random = new Random(47);
        float f[] = new float[10];
        for (int i = 1; i < 10; i++) {
            f[i] = random.nextFloat();
            System.out.println(f[i]);
            System.out.println("Длинна массива f " + f.length);
        }
        for (int x = 0; x < f.length; x++) {
            System.out.println(f[x]);
        }
    }

    void arrayInt() {
        int[] array = {51, 136, 387};

        for (int i : array) {
            System.out.println(i);

        }
    }

    void aVoid() {
        byte[] ints = {10, 15, 20};
        for (byte i : ints) {
            System.out.println(i);
            //System.out.println(ints);
        }
    }

    int[] intsArray() {
        int[] ints = {3, 7, 8};
        return ints;
    }

    void aVoid(int x[]) {
        int[] i = x;
        for (int i1 : i) {
            System.out.println(" " + i1);
        }
    }

    void target(int begin, int testval, int target, int end) {

        boolean b = ((begin < testval) && (end > target)&&(testval<target)&&(begin<end));
        if (b) {
            System.out.println(begin + " " + testval + " " + target + " " + end);
        }
    }
    void breakReturn(int y){
        for (int x=0; x<y;x++){
            System.out.println(x +" ");
            if (x==79)break;
        }
        System.out.println("Привет");
    }
}
class Initialisation {
    Initialisation(String x){
        System.out.println("Это конструктор"+x);
    }String s;
    void Print() {
        System.out.println(s);
    }

        }
        class NewIntial{
    NewIntial(){
        System.out.println("Создание простого класса");
    }
        }
        class DogHunter{
    void bark(){
        System.out.println("Без ничего");
    }
    void bark(int x){
        System.out.println("Метод с int" +x);
    }
    void bark(char x){
        System.out.println("Метод с char"+x);
    }
    void bark (int x, char c){
        System.out.print("int "+x+" char "+c);
    }
    void bark (char c, int i){
        System.out.println("char "+c+" int " +i);
    }
        }
        class thisAdd{
        int x;
        thisAdd xMount() {
            x++;
            return this;
        }
            void Print(){
                System.out.println("Print "+x);
            }
        }
        class thisSecond{
        int x;
        void second1(){
            int y=0;
            x++;
            y++;
            System.out.println(" "+x+" "+y);
        }
        void second2(){
            second1();
            second1();
        }
        void second3(){
            this.second1();
            this.second1();
        }

        }
        class constructorThis{
    int x=20;
    String s="String1";

    constructorThis(){
        this(10);
        System.out.println(x+ " () "+s);
    }
    constructorThis(int x){

        System.out.println(x+" (int x) ");
    }
    constructorThis(String x){
       // this();
        this(9);
        s=x;

        System.out.println(s+" String x");


       // this();
    }
        }

        class staticMet{
            static void statMet(){
                System.out.println("statMet");
                //metNotStat();
            }
            void metNotStat(){
                System.out.println("menNotStat");
                statMet();
            }
            //void finalize();
        }
        class fineClose{
        int x;
        void xPlus(){
            x++;
        }
        int returnInt(){
            return x;
        }

        }
        class initialData{
    boolean b;
    char c;
    byte d;
    short e;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    initialData initialData;
    void printInitialData(){
        System.out.println("boolean "+b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(anInt);
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(initialData);
            }

        }
        class DataClass{
        int i;
        DataClass(){
            System.out.println("First data "+i);
            int i=7;
            System.out.println("Second data"+i);
        }
        }

        class StatData{
        static int x=0;
        
        StatData(){
            x++;
        }
        static void statMetod(){
            System.out.println("Сколько создали обьектов "+x);
        }
        }

        class Cup{
        Cup(int cup){
          System.out.println("Cup( "+cup+" )");
        }
        void f(int cup){
            System.out.println("Cup( "+cup+" )");
        }
        }

        class Cups{
        static Cup cup1;
        static Cup cup2;
        static {
            cup1 = new Cup(1);
            cup2 = new Cup(2);
        }
        Cups(){
            System.out.println("Cups()");
        }
        }
        class StatMag{
        static int x;
        static{
            System.out.println(x);
        }
           StatMag(){
               x++;
               System.out.println("Konstruktor" +x);
           }
           static {
               x=100;
               System.out.println("x "+x);
           }

        }
        class anonimClass{
            static int z;
            String string=" Hi";
            static String string1=" Static String HI";
            int x;
            anonimClass(){
                x=10;
            System.out.println("1. Конструктор "+x+string );

        }
            {
                x++;
                System.out.println("2. Анонимный класс "+x+string);

            }
         static{
             int   y=20;
            System.out.println("3. Static метод "+y+" "+z+string1);
         }
        }
        class ArrayData{
        int []a1;
        int a[];
        int [] a3 = {1,2,3,4,5};

            {
                a = a3;
            a[3]=10;    //int l=a1.length;
            }
            {
                //int [] a3 = {1,2,3,4,5};
                int l=a3.length;
                int i=a.length;
                System.out.println(l+" "+i);
                for (int x :a3){
                System.out.println(x);
                }
                for (int x :a){
                    System.out.println("a "+x);
                }
            }

        }
        class ArreyNews{
        ArreyNews(String s){
            System.out.println ("Sring конструктор "+s);
        }
        }
        class ArreyNews1{
            ArreyNews[] arreyNews= new ArreyNews[10];
            void PrintArreyNews(){
                System.out.println("Длинна"+arreyNews.length);
                System.out.println(arreyNews[5]);
                int z=0;
                for (ArreyNews x:arreyNews){

                    arreyNews[z]= new ArreyNews("mm");
                    z++;
                  //  System.out.println("ArrNew1 "+x+" z "+z);

                }
                for (ArreyNews c: arreyNews){
                    System.out.print(" Second "+c);
                }
            }
        }
        class ArrDifLeng{
        void aVoid (Object...bb){
            int i=bb.length;
            System.out.println(" ");
            System.out.println(" DifferentLeng " +i);
        }
        }
        class DifString{
        void DifString1(String...strings){
            System.out.println(strings.length);
            for (String x:strings){
                System.out.println("Arrey string "+x);
            }
        }


        }
        class EnumDate{
        public enum enumDb {QONE, QTWO, QTHREE};
        void enumQ(enumDb x){
            switch (x){
                case QONE: System.out.println(x+" "+x.ordinal());
                break;
                case QTWO:System.out.println(x+" "+x.ordinal());
                break;
                case QTHREE: System.out.println(x+" "+x.ordinal());
                break;
                default:System.out.print(x.values());
            }
        }
                }

        class EnumDb{
        EnumDate eD= new EnumDate();

        }

    public class DogTest {

        public static void main(String[] args) {
            DogDb coins = new DogDb();
            coins.cointResult();
            coins.runFood();
            System.out.println("Rundom number " + coins.eyse());
            coins.anInt("aqwer");
            coins.aVoid(0);
            coins.trueMethod(10, 15);
            coins.trueMethod(10, 10);
            coins.trueMethod(15, 15);
            //coins.up100(10);
            //coins.diferentCount(100);
            //coins.prostNumber(10);
            coins.deleteNumber(4, 2);
            coins.deleteNumber(4, 3);
            coins.naturNumber(7);
            coins.naturNumber(8);
            coins.naturNumberCounter(100);
            coins.forEach();
            coins.arrayInt();
            coins.aVoid();
            coins.aVoid(coins.intsArray());
            coins.target(10,100,20,40);
            coins.breakReturn(1000);
            Initialisation initial = new Initialisation("Привет");
            //initial.Print();
            for (int x=0,y=10; x<y; x++){
                new Initialisation(" HI " +x);

            }
            new NewIntial();
            DogHunter dH = new DogHunter();
            dH.bark();
            dH.bark(10);
            dH.bark('n');
            thisAdd tA = new thisAdd();
            tA.xMount().xMount().xMount().Print();
            thisSecond ts = new thisSecond();
            ts.second2();
            //ts.second3();
            new constructorThis("AAA");
            staticMet sm =new staticMet();
            sm.metNotStat();
            sm.statMet();
            fineClose fC =new fineClose();
            fC.xPlus();
            System.out.print(" x " +fC.x);
            new fineClose();
            System.out.println(" x " +fC.x);
            initialData initialData =new initialData();
            initialData.printInitialData();
            DataClass dataClass= new DataClass();
            System.out.println (dataClass);
            System.out.println(sm);
            DataClass dataClass1=new DataClass();
            StatData st = new StatData();
            StatData st1 = new StatData();
            StatData st2 = new StatData();
            StatData.statMetod();
            Cups.cup1.f(99);
            StatMag Sm = new StatMag();
            StatMag Sm1 = new StatMag();
            new anonimClass();
            new anonimClass();
            new ArrayData();
            ArreyNews1 An= new ArreyNews1();
            An.PrintArreyNews();
            ArrDifLeng arrDifLeng= new ArrDifLeng();
            arrDifLeng.aVoid(1,3,4,5,6,7,8);
            arrDifLeng.aVoid(1,3,4,5);
            arrDifLeng.aVoid(new ArreyNews1(),new ArreyNews1());
            arrDifLeng.aVoid();
            System.out.println(An.getClass());
            DifString difString= new DifString();
            String []s =new String [20];

            difString.DifString1(s);
            //int w[]= new int{1,3,5,7};
            //difString.DifString1(1,4,5);
            EnumDate enumDate= new EnumDate();
            enumDate.enumQ(EnumDate.enumDb.QONE);
            enumDate.enumQ(EnumDate.enumDb.QTHREE);
            Packedge_Test1.Pack_Test pt =new Packedge_Test1.Pack_Test();
            pt.firstMethod();
            CheckProtected checkProtected = new CheckProtected();
            checkProtected.checkProtected();
            ProtectedClass protectedClass= new ProtectedClass();
          //  protectedClass.aVoidProtected();
            //CheckMany checkMany= new CheckMany();
            //checkMany.publicInt;
            //checkMany.publicMany();
            //checkMany.staticInt;

        }
    }

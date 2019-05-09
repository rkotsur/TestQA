package HAG.RKotsurLesson15;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask1 {
    public static void main(String[] args) {
        task1();
        task3(12,34);
    }
    public static void task1(){
        System.out.println(Math.sqrt(4));
        double xA=(Math.sqrt(6)+6)/2+((Math.sqrt(13)+13)/2)+((Math.sqrt(21)+21)/2);
        System.out.println(xA);
        double xB= (5+(Math.sqrt(5))/((Math.sqrt(7)+7))+((12+Math.sqrt(12)))/(Math.sqrt(8)+8))+(31+Math.sqrt(31))/(Math.sqrt(2)+2);
        System.out.println(xB);
        double xC=(15+Math.sqrt(8)/(8+Math.sqrt(15)))+(6+Math.sqrt(12))/(12+Math.sqrt(6))+(7+Math.sqrt(21))/(21+Math.sqrt(7));
        System.out.println(xC);
        double xG=(13+Math.sqrt(7))/(7+Math.sqrt(13))+(15+Math.sqrt(12))/(Math.sqrt(15)+12)+(Math.sqrt(21)+32)/(Math.sqrt(32)+21);
        System.out.println(xG);
    }

    public static void task3(int x, int y){
        System.out.println("Сумма чисел первого числа "+summ(x));
        System.out.println("Сумма чисел второго числа "+summ(y));
        if (summ(x)>summ(y)){
            System.out.println("Первое число сумма чисел больше " +x);
        }else System.out.println("Второе число сумма чисел больше "+y);
    }
    public static int summ(int z){
        int x=z/10;
        int y=z%10;
        return x+y;
    }
}

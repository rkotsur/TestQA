package HAG.RKotsurLesson13;

import java.util.Scanner;

/**
 * Created by 1 on 27.01.2019.
 */
public class HwTask2 {
    public static void main(String[] args) {
        task2();
    }
    static public void task2(){
        String  lineStr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        lineStr=scanner.nextLine();
        System.out.println(lineStr.length());
        if (lineStr.length()%2==0){
            System.out.println("Средний символ в строке: "+(lineStr.charAt((lineStr.length()/2)-1))+""+lineStr.charAt(lineStr.length()/2));
        }else System.out.println("Средний символ в строке: "+lineStr.charAt(lineStr.length()/2));
    }
}

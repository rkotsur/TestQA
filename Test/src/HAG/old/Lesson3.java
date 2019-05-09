package HAG.old;

import java.util.Scanner;

/**
 * Created by 1 on 08.12.2018.
 */
public class Lesson3 {
    public static void main(String[] args) {

        //taskOne();
        //task2();
        task3();
    }
    public static void taskOne(){
        double hour,mint,second;
        double hourGrad, minGrad, secondGrad,sumGrad;
        final double moon =360.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls input hour");
        hour= scanner.nextInt();
        System.out.println("Pls input mint");
        mint= scanner.nextInt();
        System.out.println("Pls input second");
        second= scanner.nextInt();
        System.out.println(hour+" "+mint+" "+second);
        hourGrad= (360/12)*hour;
        minGrad=(30.00/60.00)*mint;
        secondGrad=0.5/60*second;
        System.out.println( " hourGrad="+hourGrad+" minGrad="+minGrad+" secondGrad="+secondGrad);
        sumGrad=hourGrad+minGrad+secondGrad;
        if (sumGrad>moon){
            sumGrad=sumGrad-moon;
        }
        System.out.println(sumGrad);

        int degreeLast = (int) sumGrad;
        double rawMinute = (sumGrad % 1) * 60;
        System.out.println("rawMinute="+rawMinute);
        int minuteLast = (int) rawMinute;
        int secondLast = (int) (rawMinute % 1) * 60;
        System.out.println(String.format("%d° %d′ %d″", degreeLast,minuteLast,secondLast));
        scanner.close();
    }
    public static void task2(){
        double pastTime;
        int hour, minut;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls input count");
        pastTime=scanner.nextDouble();
        hour=(int)pastTime/30;
        //System.out.println(hour);
        minut=(int)((pastTime%30)/0.5);
        //System.out.println(minut);
        scanner.close();
        if (minut>10){
        System.out.println("Now time "+hour+":"+minut);}
        else System.out.println("Now time "+hour+":0"+minut);
    }

    public static void task3(){
        double pastTime;
        int hour, minut;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls input count");
        pastTime=scanner.nextDouble();
        hour=(int)pastTime/30;
        //System.out.println(hour);
        minut=(int)((pastTime%30)/0.5);
        //System.out.println(minut);
        scanner.close();
        if (minut>10){
            System.out.println("Now time "+hour+":"+minut);}
        else System.out.println("Now time "+hour+":0"+minut);
        System.out.println("Degree min "+(minut*6)+"°");
    }

}

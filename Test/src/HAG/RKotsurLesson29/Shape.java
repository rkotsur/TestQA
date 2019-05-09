package HAG.RKotsurLesson29;

import java.util.Scanner;

/**
 * Created by 1 on 19.02.2019.
 */
public interface Shape {
    double volume();
    double square();
    void intialBlock();
}

class Block implements Shape {
    int longBlock;
    int widthBlock;
    int heightBlock;
    Scanner scanner = new Scanner(System.in);

    public void intialBlock() {
        System.out.println("Введите данные блока");
        System.out.print("Длинна блока ");
        longBlock = scanner.nextInt();
        System.out.print("Ширина блока ");
        widthBlock = scanner.nextInt();
        System.out.print("Высота блока ");
        heightBlock = scanner.nextInt();
    }


    public double square() {
        int x = (longBlock * heightBlock * 2 + widthBlock * longBlock * 2 + heightBlock * widthBlock * 2);
        return x;
    }


    public double volume() {
        double x = widthBlock * longBlock * heightBlock;
        return x;
    }

    @Override
    public String toString() {
        String s = getClass()+" Размеры блока длинна=" + longBlock + " ширина=" + widthBlock + " высота=" + heightBlock + " объем =" + volume() +
                " площадь =" + square();
        return s;
    }
}
class Sphere implements Shape{
    int radiusSphera;
    Scanner scanner = new Scanner(System.in);

   public void intialBlock() {
        System.out.println("Введите данные сферы");
        System.out.print("Радиус сферы ");
        radiusSphera = scanner.nextInt();

    }
    public double volume(){
        return (4*Math.PI*Math.pow(radiusSphera,3)/3);
    }
    public double square(){
        return 4*Math.PI*Math.pow(radiusSphera,2);
    }
    @Override
    public String toString() {
        String s = getClass()+" Габариты сферы радиус= " +  " объем =" + volume() +
                " площадь =" + square();
        return s;
    }
}
class  Pyramid implements Shape{
    int longPyramid;
    int widthPyramid;
    Scanner scanner = new Scanner(System.in);

    public void intialBlock() {
        System.out.println("Введите данные Пирамиды");
        System.out.print("Высота пирамиды ");
        widthPyramid = scanner.nextInt();
        System.out.print("Длинна основания пирамиды ");
        longPyramid = scanner.nextInt();
    }


    public double square() {
        double x = ((Math.sqrt((widthPyramid*widthPyramid)+((longPyramid/2)*(longPyramid/2))))*longPyramid)/2;
        return x;
    }


    public double volume() {
        double x = (longPyramid*longPyramid*widthPyramid)/3;
        return x;
    }

    @Override
    public String toString() {
        String s = getClass()+" Размеры пирамиды длинна основания=" + longPyramid + " высота=" + widthPyramid + " объем =" + volume() +
                " площадь =" + square();
        return s;
    }
}

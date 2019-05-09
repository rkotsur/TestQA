package HAG.RKotsurLesson18;

/**
 * Created by 1 on 02.02.2019.
 */
public class CircleRun {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 20, 3);
        Circle circle1 = new Circle(10, 20, 3);

        //String string = " ";

        circle.x = 11;
        circle.y = 22;
        circle.r = 5;
        circle.zoom(2);
        System.out.println(circle);
        //Запуск первого метода определяет длинну окружности.
        System.out.println("circle1.lineCircle() "+circle1.lineCircle());
        //Запуск второго метода перемещение центра окружности
        circle.moveCircle(11,24);
        //Запуск третего метода определяет площадь
        System.out.println("Площадь круга = "+circle.sqCircle());





    }
}

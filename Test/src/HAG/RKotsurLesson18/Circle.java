package HAG.RKotsurLesson18;

/**
 * Created by 1 on 02.02.2019.
 */

    public class Circle {
        //свойства(поля) класса
        double x;
        double y;
        double r;

        static final double PI;

        static{
            PI = 3.14;
        }

        public Circle() {
        }

        public Circle(double x, double y, double r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }

    /**
     * •	Создайте в классе Circle метод, вычисляющий длину окружности.
     */
        public double lineCircle(){

            double lineCircle=0;
            lineCircle=2*r*PI;
           return lineCircle;
        }
    /**
     * •	Создайте в классе Circle метод, который будет перемещать центр окружности на заданное расстояние.
     */
    public void moveCircle(double aa, double bb){
        //метод принимает координаты куда переместить центр окружности
        x=aa;
        y=bb;
        System.out.println("Новые координаты х =" +aa+" y ="+bb);;
    }

    /**
     *•	Создайте в классе Circle метод,
     * вычисляющий площадь той окружности, к которой метод применён.
     *
     */
    public double sqCircle(){
        double sqCircle=PI*Math.pow(r,2);
        return sqCircle;
    }

        //методы класа(поведение)
        public void print(){
            System.out.println("Окружность с такими координатами "
                    + " x = " + x + " у = " + y + "   " +"радиус = "+r);
        }


        public void zoom(int k){
            r = r*k;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "x=" + x +
                    ", y=" + y +
                    ", r=" + r +
                    '}';
        }
    }




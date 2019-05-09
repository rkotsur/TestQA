package HAG.RKotsurLesson28;

import javax.xml.bind.annotation.XmlInlineBinaryData;

/**
 * 1)	В рамках некоторой системы необходимо разработать набор классов для хранения информации о треугольниках на плоскости.
 Известно, что треугольник состоит из трех точек.

 */
public class TriangFlat {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

    class CoordinTriangle{
    TriangFlat triangFlat= new TriangFlat();
    void aCoord(int aCoordX){
        triangFlat.setX(aCoordX);
    }
    void bCoord(int aCoordY){
            triangFlat.setY(aCoordY);
        }
        CoordinTriangle(int x, int y){
        aCoord(x);
        bCoord(y);
        }

        @Override
        public String toString() {
            return "CoordinTriangle{" +
                    "triangFlat=" + triangFlat.getX() +";"+triangFlat.getY()+
                    '}';
        }
    }

    class Run{
        public static void main(String[] args) {
            CoordinTriangle coordinTriangles0= new CoordinTriangle(10,10);
            CoordinTriangle coordinTriangles1= new CoordinTriangle(0,0);
            CoordinTriangle coordinTriangles2= new CoordinTriangle(1,1);
            System.out.println(coordinTriangles0);
            System.out.println(coordinTriangles1);
            System.out.println(coordinTriangles2);
        }
    }



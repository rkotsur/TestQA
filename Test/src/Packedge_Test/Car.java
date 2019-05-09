package Packedge_Test;

/**
 * Created by 1 on 10.12.2018.
 */
class Engine{
    public void start(){
        System.out.println("Start engine");
    }
    public void stop(){
        System.out.println("Stop engine");
    }
    public void rev(){
        System.out.println("REV");
    }
    public void service(){
        System.out.println("SERVICE ENGINE STOP");
    }
}
class Wheels{
    public void psiWheels(int x){
        System.out.println("psi="+x);
    }
}
class Window{
    public void rollUP(){
        System.out.println("Window.rollUp");
    }
    public void rollDown(){
        System.out.println("Window.rollDown");
    }
}
class Door{
    public void closeDoor(){
        System.out.println("Door.close");
    }
    public void openDoor(){
        System.out.println("Door open");
    }
}
class Factory{
    public Engine engine= new Engine();
    public Wheels wheels = new Wheels();
    public Window window= new Window();
    public Door door =new Door();


}

public class Car {
    public static void main(String[] args) {
        Factory factory= new Factory();
        factory.door.closeDoor();
        factory.engine.start();
        factory.engine.service();
    }


}

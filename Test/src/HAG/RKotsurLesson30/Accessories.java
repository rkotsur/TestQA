package HAG.RKotsurLesson30;

/**
 * Created by 1 on 22.02.2019.
 */
public interface Accessories {
     void connectCable();
     void install();
     void connectConnector();

}
class CPU implements Accessories {
   public void connectCable(){
       System.out.println("Connect CPU");
    }
    public void install(){
        System.out.println("Install CPU");
    }
    public void connectConnector(){
        System.out.println("Connect FAN CPU");
    }

}
class RAM implements Accessories{
    public void connectCable(){
        System.out.println("Connect FAN");
    }
    public void install(){
        System.out.println("Install RAM");
    }
    public void connectConnector(){
        System.out.println("Connect RAM");
    }
}
class HDD implements Accessories{
    int size;
    HDD(int x){
        System.out.println("HDD "+x+" Gb");
        size=x;
    }
    int size(){
        return size;
    }
    public void connectCable(){
        System.out.println("Conect HDD");
    }
    public void install(){
        System.out.println("Install HDD");
    }
    public void connectConnector(){
        System.out.println("Connect connector HDD");
    }
}
class FDD implements Accessories{
    public void connectCable(){
        System.out.println("Connect FDD");
    }
    public void install(){
        System.out.println("Install FDD");
    }
    public void connectConnector(){
        System.out.println("Connect connector FDD");
    }
}

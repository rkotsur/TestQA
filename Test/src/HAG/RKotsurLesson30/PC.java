package HAG.RKotsurLesson30;

/**
 * Created by 1 on 22.02.2019.
 */
public class PC <C extends Accessories> {
    void assembly(C c){
        c.connectCable();
        c.connectConnector();
        c.install();

    }
    void onPC(){
        System.out.println("on PC");
    }
    void offPC(){
        System.out.println("off PC");
    }
    void checkVirus(){
        System.out.println("CPU 100% find Virus");
    }
    void hddSize(HDD hdd){
        System.out.println(hdd.size);
    }



    }


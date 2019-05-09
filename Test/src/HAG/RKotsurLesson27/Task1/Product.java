package HAG.RKotsurLesson27.Task1;

/**
 2) Создать интерфейсы: Товар <- Телефоны и планшеты <- Мобильные телефоны
 Класс Смартфоны должен реализовать указанные интерфейсы и содержать дополнительно 4-5 полей.
 На базе класса Смартфоны создать как минимум пять экземпляров класса.
 В качестве источника информации о характеристиках товаров можно взять магазины
 * Created by 1 on 13.02.2019.
 */

public interface Product {
    String name=null;
    String whoMade = null;

}

interface SmartPhoneAndTablet{
    boolean gsm =true;
}
class SmartPhone implements SmartPhoneAndTablet, Product{
    SmartPhone(String nameK, String whoMadeK, boolean typeK, String cpuTypeK,
               int countCpuK,
               double screenK,
               int batCappacityK,
               String nameSmartPhoneK) {
//        name=nameK;
//        whoMade=whoMadeK;
//        gsm =typeK;
        cpuType=cpuTypeK;
        countCpu=countCpuK;
        screen=screenK;
        batCappacity=batCappacityK;
        nameSmartPhone=nameSmartPhoneK;
        }

    String cpuType=null;
    int countCpu=0;
    double screen =0;
    int batCappacity=0;
    String nameSmartPhone=null;

}
class ClassSmartPh {
    SmartPhone  smartPhone0 = new SmartPhone("Phone",
            "Korea",
            true, "MediaTec",
            4,5.5, 4000,
            "Nexus");
    SmartPhone  smartPhone1 = new SmartPhone("Tablet",
            "China",
            false, "MediaTec",
            6,6, 4500,
            "Gav");
    SmartPhone  smartPhone2 = new SmartPhone("Phone",
            "China",
            true, "A12",
            8,5.0, 5000,
            "J5");
    SmartPhone  smartPhone3 = new SmartPhone("Phone",
            "China",
            true, "MediaTec",
            10,5.5, 4000,
            "Galaxy A");
    SmartPhone  smartPhone4 = new SmartPhone("Tablet",
            "China",
            false, "MediaTec",
            8,5.2, 4100,
            "Redmi 4x");

    @Override
    public String toString() {
        return "ClassSmartPh{" +
                "smartPhone0=" + smartPhone0 +
                ", smartPhone1=" + smartPhone1 +
                ", smartPhone2=" + smartPhone2 +
                ", smartPhone3=" + smartPhone3 +
                ", smartPhone4=" + smartPhone4 +
                '}';
    }
}




class Run {
    public static void main(String[] args) {
        ClassSmartPh classSmartPh= new ClassSmartPh();
        System.out.println(classSmartPh.smartPhone0.nameSmartPhone);

    }
}

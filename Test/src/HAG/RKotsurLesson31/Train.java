package HAG.RKotsurLesson31;

import java.util.Scanner;

/**
 * Created by 1 on 26.02.2019.
 */
public interface Train {
   // void addTypeWagons(E <?> wagons);
//    int sizeCoupe();
//    int sizePlacecart();
//    int sizeSuite();
//    int sizeFull();
//    int byeTicket();
//    int deleteTicket();
//    int sizeAllCoupe();
//    int sizeAllPlacecart();
//    int sizeAllSuite();

}
class BaseTrain{
    final int sizeTrain=20;
    int countCoupe;
    int countPlacecart;
    int countSuite;
    int leftEmptyTotrine;
    int iDTrain;
    int summWagon;
    public int fullTrainCoupe;
    public int fullTrainPlacecart;
    public int fullTrainSuite;

    Wagons wagons[] =new Wagons[sizeTrain];


    void addWagons(){//Метод определяет композицию состава
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID поезда");
        iDTrain= scanner.nextInt();
        do {
            System.out.println("Введите сколь вагонов СВ ");
            countSuite = scanner.nextInt();
            System.out.println("Введите сколь вагонов купе ");
            countCoupe = scanner.nextInt();
            System.out.println("Введите сколь вагонов плацкарт ");
            countPlacecart = scanner.nextInt();
            summWagon=countSuite+countCoupe+countPlacecart;
        }while (!(sizeTrain>=summWagon));
       // scanner.close();
    }

    void arrWagons(){
        for (int i = 0; i <=countSuite ; i++) {
            wagons[i]=new Suite();
            leftEmptyTotrine=i;
           // System.out.println("1 "+leftEmptyTotrine);
        }
        for (int i = 0; i<countCoupe ; i++) {
            wagons[leftEmptyTotrine]=new Coupe();
            leftEmptyTotrine++;
           // System.out.println("2 "+leftEmptyTotrine);

        }
        for (int i = 0; i <countPlacecart ; i++) {
            wagons[leftEmptyTotrine]=new Placecart();
            leftEmptyTotrine++;
            // System.out.println("3 "+leftEmptyTotrine);
        }
    }
    void checkArr(){
        for (int i = 0; i <summWagon ; i++) {
            System.out.println(wagons[i]);
            System.out.println(wagons[i].getSizeWagon());
        }
    }

    void fullSizeTrain(){
        fullTrainCoupe=countCoupe*(new Coupe().getSizeWagon());
        fullTrainPlacecart=countPlacecart*(new Placecart().getSizeWagon());
        fullTrainSuite=countCoupe*(new Suite().getSizeWagon());
        System.out.println("\nИдентификатор поезда "+iDTrain+" Всего мест в купе ="+ fullTrainCoupe+" в плацкарт ="+ fullTrainPlacecart+" в CВ ="+ fullTrainSuite);
    }

    void bayTrainCoupe(int x){
        fullTrainCoupe=fullTrainCoupe-x;
    }
    void bayTrainSuite(int x){
        fullTrainSuite=fullTrainSuite-x;
    }
    void bayTrainPlacecart(int x){
        fullTrainPlacecart=fullTrainPlacecart-x;
    }
    void bayAllTrain(){
        System.out.println("\nИдентификатор поезда "+iDTrain+" Всего мест в купе ="+ fullTrainCoupe+" в плацкарт ="+ fullTrainPlacecart+" в CВ ="+ fullTrainSuite);
    }

}


class TestRun {
    public static void main(String[] args) {
        BaseTrain train = new BaseTrain();
        train.addWagons();
        train.arrWagons();
       // train.checkArr();
        train.fullSizeTrain();


    }
}
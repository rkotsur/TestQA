package HAG.RKotsurLesson31;

import java.util.Scanner;

/**
 * Created by 1 on 26.02.2019.
 */
public class Depo {
    int countTrain;
    BaseTrain []arrDepo;
    Depo (int countTrain){
        countTrain=countTrain;
        arrDepo = new BaseTrain[countTrain];

    }

    void setCountTrain(int count) {//Задать количество составов;
        countTrain = count;
    }
    //BaseTrain []arrDepo = new BaseTrain[countTrain];

    void fillArrDepo(){
        System.out.println("Количество составов в депо "+ arrDepo.length);
    }

    void fillTrain(){// Заполнить композицию составов в депо;
        for (int i = 0; i <arrDepo.length ; i++) {
            arrDepo[i]= new BaseTrain();
            arrDepo[i].addWagons();
            arrDepo[i].arrWagons();

        }
            }
    void DataTrainAll(){//Вывести информацию про составы
        for (int i = 0; i <arrDepo.length ; i++) {
            arrDepo[i].fullSizeTrain();


        }
    }
    void findTrain(){
        System.out.println("Введите тип места что вы ищете\n1. СВ \n2. Купе \n3. Плацкарт");
        Scanner scanner = new Scanner(System.in);
        int type=scanner.nextInt();
        System.out.println("Введите количестов мест что вы ищете\n");
        int mest=scanner.nextInt();

            System.out.println("Вам подходят эти поезда");
        if (type==1){
            for (int i = 0; i <arrDepo.length ; i++) {
//                System.out.println(arrDepo.length);
//                System.out.println(arrDepo[i].fullTrainSuite);
                if (arrDepo[i].fullTrainSuite>=mest){
                    arrDepo[i].fullSizeTrain();
                }

            }

        }
        if (type==2){

            for (int i = 0; i <arrDepo.length ; i++) {
//                System.out.println(arrDepo.length);
//                System.out.println(arrDepo[i].fullTrainCoupe);
            if (arrDepo[i].fullTrainCoupe>=mest){
                arrDepo[i].fullSizeTrain();
            }

            }
        }
        if (type==3){
            for (int i = 0; i <arrDepo.length ; i++) {
//                System.out.println(arrDepo.length);
//                System.out.println(arrDepo[i].fullTrainPlacecart);
                if (arrDepo[i].fullTrainPlacecart>=mest){
                    arrDepo[i].fullSizeTrain();
                }
            }
        }

        }
    }



class Run1Test {
    public static void main(String[] args) {
        Depo depo = new Depo(3);
//        //depo.setCountTrain(3);
//        depo.fillArrDepo();
//        depo.fillTrain();
//        depo.DataTrainAll();
        depo.findTrain();

    }
}
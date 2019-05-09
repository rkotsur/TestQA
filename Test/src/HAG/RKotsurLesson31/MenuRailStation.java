package HAG.RKotsurLesson31;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * Created by 1 on 26.02.2019.
 */
public class MenuRailStation {
    public void menuMain() {
        int valueMenu;
        System.out.println("Введите количество поездов");
        Scanner scanner = new Scanner(System.in);
        Depo depo = new Depo(scanner.nextInt());
        depo.fillArrDepo();
        depo.fillTrain();
        depo.DataTrainAll();
        depo.findTrain();

        }
    }



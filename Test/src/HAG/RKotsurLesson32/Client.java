package HAG.RKotsurLesson32;

import java.util.Scanner;

/**
 * Created by 1 on 08.03.2019.
 */
public class Client {
    String nameClient;
    static int id;
     public int idClient;

    public boolean isGoodBuyer() {
        return goodBuyer;
    }

    boolean goodBuyer=true;
   void Client1(){
        ClientId();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя клиента");
        nameClient=scanner.nextLine();

    }
    void ClientId(){
        idClient=id;
        id++;
    }


    public int getIdClient() {
        return idClient;
    }

    void badBuyer(){
        goodBuyer=false;
    }

    public String getNameClient() {
        return nameClient;
    }

    String statusClient(){
        if (goodBuyer){
          return "Надежный покупатель";
        }else{
            return "Не надежный покупатель";
        }

    }


}

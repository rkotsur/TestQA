package HAG.RKotsurLesson32;

import java.util.Scanner;

/**
 * Created by 1 on 08.03.2019.
 */
public class AdminShop {
    Goods[] goodsArr;
    Client[] clientArr;
    Goods[] byeGoods = new Goods[10];
    Client[] byeClients = new Client[10];
    static int deal = 0;


    void addGoods() {
        System.out.println("Сколько товаров занести в таблицу");
        Scanner scanner = new Scanner(System.in);
        goodsArr = new Goods[scanner.nextInt()];
        for (int i = 0; i < goodsArr.length; i++) {
            goodsArr[i] = new Goods();
            goodsArr[i].Goods1();
        }
    }

    void listGoods() {
        for (Goods x :
                goodsArr) {
            System.out.println("ID " + x.getId() + " Name " + x.getNameGoods() + " Price " + x.getPrice() + " Count goods " + x.getCountGoods());

        }
    }

    void addClient() {
        System.out.println("Количество клиентов");
        Scanner scanner = new Scanner(System.in);
        clientArr = new Client[scanner.nextInt()];
        for (int i = 0; i < clientArr.length; i++) {
            clientArr[i] = new Client();
            clientArr[i].Client1();
        }
    }

    void listClient() {
        for (Client x :
                clientArr)
            System.out.println("ID " + x.getIdClient() + " Name " + x.nameClient + " Status " + x.statusClient());
    }
    void badClient(){
        System.out.println("Введите ID плохого клиента");
        Scanner scanner = new Scanner(System.in);
        clientArr[scanner.nextInt()].badBuyer();

    }

    void bye() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID клиента покупателя");
        int x = scanner.nextInt();
        if (clientArr[x].isGoodBuyer()) {
            System.out.println("Введите ID товара ");
            int idGoods = scanner.nextInt();
            System.out.println("Количество");
            int countGoods = scanner.nextInt();
            if (goodsArr[idGoods].minusGoods(countGoods)) {
                //Передается ссылка на обьект нужно сгенерировать новый обьект с задаными
                //   спараметрами это хаписать в масив а я передал ссылку на обьект друго масива
                byeClients[deal] =new Client();
                //Создает обьект и переносит все его значения
                byeClients[deal].idClient=clientArr[x].idClient;
                byeClients[deal].nameClient=clientArr[x].nameClient;
                byeClients[deal].goodBuyer=clientArr[x].goodBuyer;

                //byeClients[deal] = clientArr[x];
                //Создает обьект и переносит все его значения
                byeGoods[deal]= new Goods();
                byeGoods[deal].idGoods=goodsArr[x].idGoods;
                byeGoods[deal].price=goodsArr[x].price;
                byeGoods[deal].countGoods=goodsArr[x].countGoods;
                byeGoods[deal].nameGoods=goodsArr[x].nameGoods;
                //byeGoods[deal] = goodsArr[idGoods];

                deal++;


            }

            System.out.println();

        } else System.out.println("Вы не надежный клиент");


    }
    void listBye(){
        for (int x=0; x<deal;x++){

            System.out.println("ID " + byeGoods[x].getId() + " Name " + byeGoods[x].getNameGoods() + " Price " + byeGoods[x].getPrice() + " Count goods " + byeGoods[x].getCountGoods());
            System.out.print("      ID " + byeClients[x].getIdClient() + " Name " + byeClients[x].nameClient + " Status " + byeClients[x].statusClient());
        }
    }
}
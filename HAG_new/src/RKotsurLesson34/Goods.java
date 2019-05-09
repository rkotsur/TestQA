package RKotsurLesson34;

import java.util.Scanner;

/**
 * Created by 1 on 15.03.2019.
 */
public class Goods {
    String manufacturer;
    String nameProduct;
    int price;
    Goods(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите производителя товара");
        manufacturer=scanner.nextLine();
        System.out.println("Введите название товара");
        nameProduct=scanner.nextLine();
        System.out.println("Введиет цену товара");
        price=scanner.nextInt();
    }
    Goods(String manufacturerConstr, String nameProductConstr, int priceConstr){
        this.manufacturer=manufacturerConstr;
        this.nameProduct=nameProductConstr;
        this.price=priceConstr;
    }

}

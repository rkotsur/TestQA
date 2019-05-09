package HAG.RKotsurLesson32;

import java.util.Scanner;

/**
 * Created by 1 on 08.03.2019.
 */
public class Goods {
    static int id=0;
    int idGoods;
    float price;
    String nameGoods;
    int countGoods;
    void Goods1(){
        Scanner scanner =new Scanner(System.in);
        setId();
        System.out.println("Название товара");
        setNameGoods(scanner.nextLine());
        System.out.println("Цена товара");
        setPrice(scanner.nextFloat());
        System.out.println("Количество товаров");
        countGoods=scanner.nextInt();
    }
    boolean minusGoods(int countGoodsMethod){
        if (countGoods>=countGoodsMethod){
            countGoods=countGoods-countGoodsMethod;
            return true;
        }else {
            System.out.println("Вы не можете купить столько товара");
            return false;
        }


    }

    public int getId() {
        return idGoods;
    }

    public void setId() {
        this.idGoods=id;
        id++;
    }

    public float getPrice() {
        return price;
    }
    public float getCountGoods() {
        return countGoods;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNameGoods() {
        return nameGoods;
    }

    public void setNameGoods(String nameGoods) {
        this.nameGoods = nameGoods;
    }
}

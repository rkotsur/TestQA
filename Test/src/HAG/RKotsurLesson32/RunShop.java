package HAG.RKotsurLesson32;

/**
 * Created by 1 on 08.03.2019.
 */
public class RunShop {
    public static void main(String[] args) {
        AdminShop adminShop= new AdminShop();
        adminShop.addGoods();
        adminShop.listGoods();
        adminShop.addClient();
        adminShop.listClient();
        adminShop.badClient();
        adminShop.listClient();
        adminShop.bye();

        adminShop.listBye();
        adminShop.listGoods();
    }


}

package RKotsurLesson34_1;

public class Goods {
    String name;
    String factorCompany;
    int price;

    public Goods(String name, String factorCompany, int price) {
        this.name = name;
        this.factorCompany = factorCompany;
        this.price = price;
    }
    String getFactoryCompany(){
        return this.factorCompany;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }


}

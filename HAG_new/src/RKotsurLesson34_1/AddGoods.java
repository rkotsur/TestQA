package RKotsurLesson34_1;

import java.util.*;

//Создать консольное приложение
// ● Необходимо создать приложение, которое выводит список производителей.
//● При выборе производителя выводятся все его товары.
// ● Производитель может иметь много товаров.
//● Работу с пользователем организовать через консоль.
//● Выполнить сортировку товаров по имени и цене.

public class AddGoods {
    Goods goods0= new Goods("Phone", "Samsung",20);
    Goods goods1= new Goods("Phone", "Samsung",10);
    Goods goods2= new Goods("Phone1", "Samsung",12);
    Goods goods3= new Goods("Phone2", "Nokia",15);
    Goods goods4= new Goods("Phone3", "Samsung",14);
    Set <String> arrFactoryCompany = new HashSet<>();
    List <Goods> arrList= new ArrayList<>();
    boolean setBoolean;
    void addList(){
        arrList.add(goods0);
        arrList.add(goods1);
        arrList.add(goods2);
        arrList.add(goods3);
        arrList.add(goods4);
    }

    void addArrFactory(){
        for (Goods x:arrList
             ) {
            setBoolean=arrFactoryCompany.add(x.getFactoryCompany());

        }
        for (String y:arrFactoryCompany
                 ) {
                System.out.println(y);
            }
        }
     void findForFactoryCompany(){
         String company;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Введите название компании");
         company=scanner.nextLine();

         for (Goods y:arrList) {
             if(y.getFactoryCompany().equals(company)){
                 System.out.println("Название "+y.getName()+"\tцена "+y.getPrice());

             }
         }

     }
     void sortedCollection(){
         arrList.sort((o1, o2) -> {
             if (o1.getName()==o2.getName())
             return (o1.getPrice())-(o2.getPrice());
             else return o1.getName().compareTo(o2.getName());
         });
         System.out.println("\tОтсортированный список по названию и цене");
         for (Goods y:arrList) {

                 System.out.println("\tНазвание "+y.getName()+"\tцена "+y.getPrice()+"\tпроизводитель "+y.getFactoryCompany());

             }
         }
    }




class RunCheck{
    public static void main(String[] args) {
        AddGoods addGoods = new AddGoods();
    addGoods.addList();
    addGoods.addArrFactory();
    addGoods.findForFactoryCompany();
    addGoods.sortedCollection();

    }
}

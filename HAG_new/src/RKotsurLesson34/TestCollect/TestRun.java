package RKotsurLesson34.TestCollect;

import RKotsurLesson34.Goods;

import java.util.*;
import java.util.stream.Collectors;

public class TestRun {
 static   void test() {
        List<String> alphaNumbers = Arrays.asList("one", "two", "three", "four");



        List<String> alphaNumbersUpperCase = alphaNumbers.stream()
                //.map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(alphaNumbersUpperCase);


     List <Goods> db = new ArrayList<>();

     Goods goods0= new Goods("Phone1","Samsung", 10);
     Goods goods1= new Goods("Phone2","Nokia", 1);
     Goods goods2= new Goods("Phone3","Nokia", 4);
     Goods goods4= new Goods("Phone5","Samsung", 6);

     Set <String> manufacturedArr= new HashSet<>();
     manufacturedArr.add(goods0.manufacturerGoods);


     //List<String> alphaNumbers = Arrays.asList("one", "two", "three", "four");
//     List<> alphaNumbersUpperCase1 = db.stream()
//             .map(String::toUpperCase)
//             .sorted()
//             .collect(Collectors.toList());
//     System.out.println(alphaNumbersUpperCase);
    }


    static class Goods {
     String nameGoods;
     String manufacturerGoods;
     int priceGoods;

     Goods(String name, String manufacturer, int price){
         this.nameGoods=name;
         this.manufacturerGoods=manufacturer;
         this.priceGoods=price;
     }
    }





    public static void main(String[] args) {
        test();
    }
}

package DelTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;
class Item{
    static int t=0;
    Item(){
        t++;
        x+=t;
        r+=t;
    }
    int x;
    int r;
    char getR(){
        return (char)r;
    }
    int getX(){
        return x;
    }

}

public class Deal {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3","a1");
        Collection<Item> collection1 = Arrays.asList();
        collection1.add(new Item());
        collection1.add(new Item());
        collection1.add(new Item());
        collection1.add(new Item());
        collection1.add(new Item());
        Stream <Item> itemStream= (Stream<Item>) collection1.stream();
//                .filter();
//
//        peoples.stream().
//                sorted((o1, o2) -> o1.getSex() != o2.getSex()? o1.getSex()
//                .compareTo(o2.getSex()): o1.getAge()
//                .compareTo(o2.getAge()))
//                .collect(Collectors.toList());

        long streamFromCollection = collection.stream()
       // .filter("a2"::equals)
        .count();
        System.out.println(streamFromCollection);
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");
    }
}

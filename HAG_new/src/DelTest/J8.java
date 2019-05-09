package DelTest;

import java.util.*;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;


public class J8 {
        public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("John", 25),
                new User("Tim ", 34),
                new User("Alex", 21)
        );

        System.out.println("Before sort");
        for (User x : users) {
            System.out.println(x);

        }

//        Collections.sort(users, new Comparator<User>(){
//        @Override
//                public int compare(User o1,User o2){
//            return o1.getAge() - o2.getAge();
//        }
//    }

//            );
//
//Collections.sort(users, (o1,o2)->o1.getAge()-o2.getAge());
        users.sort((o1,o2)->o1.getAge()-o2.getAge());
//        users.sort(o1)

        System.out.println("\nAfter sort:");
            for (User y:users) {
                System.out.println(y);
            }

List<Integer> numbers = Arrays.asList(1,23,4,6,7);
            numbers.forEach(number -> System.out.print("\t"+number));
}
}

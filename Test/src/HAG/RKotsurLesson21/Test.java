package HAG.RKotsurLesson21;

/**
 * Created by 1 on 02.02.2019.
 */
public class Test {
    public static void main(String[] args) {
        Human granfather1 = new Human("Петя", true, 80 );
        Human granfather2 = new Human("Вася", true, 81 );
        Human granmother1 = new Human("Маша", false, 82);
        Human granmother2 = new Human("Настя", false, 83);
        Human father1 = new Human("Вова", true, 40 , granfather1,granmother1);
        Human mother1 = new Human("Лиля", false, 42 , granfather2,granmother2);
        Human child1 = new Human("Артем", true, 5 , father1, mother1);
        Human child2 = new Human("Катя", false, 10 , father1,mother1);
        Human child3 = new Human("Даша", false, 15 , father1,mother1);
        System.out.println(child3);
        System.out.println(father1);


    }
}

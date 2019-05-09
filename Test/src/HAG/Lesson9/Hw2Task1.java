package HAG.Lesson9;

/**
 * Created by 1 on 19.01.2019.
 */
public class Hw2Task1 {
    public static void main(String[] args) {
        String s = "Привет мир";
        String one= "При.*";
        String two="П.* мир";
        boolean b=s.matches(one);
        System.out.println(b);
        System.out.println(s.matches(two));
    }
}

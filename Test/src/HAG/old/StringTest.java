package HAG.old;

/**
 * Created by 1 on 29.12.2018.
 */
public class StringTest {
    public static void main(String[] args) {
        test();

    }
    public static void test(){
        String s ="  Java this " +
                "work";
        String ss= " Привет как тут";
        Object object = new Object();
        String obString;
        System.out.println(s.trim());
        System.out.println(s);
        System.out.println(s.concat(ss));
        System.out.println(ss.valueOf(object));
        System.out.println(ss.compareTo(s));
        for (int i=0; i<(s.length()-1);i++) {
            System.out.println(ss.charAt(i));
        }
        //System.out.println(s.getChars(1,5));

    }


}

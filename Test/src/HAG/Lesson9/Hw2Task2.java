package HAG.Lesson9;

/**
 * Created by 1 on 20.01.2019.
 */
public class Hw2Task2 {
    public static void main(String[] args) {
        String line="Маша ела кашу";
        char [] arrChar= new char[line.length()];

        for (int i=0;i<line.length();i++) {
            System.out.println(line.charAt(i));
            arrChar[i]=line.charAt(i);

        }
        System.out.print("\nМаcсив arrChar ");
        for (char s :
             arrChar) {
            System.out.print(" "+s);
        }
    }
}

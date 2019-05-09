package HAG.RKotsurLesson27.Task2;

/**
 * Created by 1 on 19.02.2019.
 */
public class DeveloperRunner {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("Jon");
        CppDeveloper cppDeveloper= new CppDeveloper("Tom");
        System.out.println(javaDeveloper);
        System.out.println(cppDeveloper);
        cppDeveloper.breatheAir();
        javaDeveloper.enjoiLife();
    }
}

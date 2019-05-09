package HAG.RKotsurLesson27.Task2;

/**
 * Created by 1 on 19.02.2019.
 */
public class CppDeveloper implements Developer,Human{
    private String name;
    CppDeveloper(String nameK){
        System.out.println("Инициализация класса CppDeveloper");
        name = nameK;
    }

    @Override
    public void breatheAir() {
        System.out.println("Метод breatheAir интерфейса Human ");

    }

    @Override
    public void writeCode() {
        System.out.println("Метод writeCode интерфейса Developer ");
    }

    @Override
    public void enjoiLife() {
        System.out.println("Метод enjoiLife интерфейса Developer ");
    }

    @Override
    public String toString() {
        return "CppDeveloper{" +
                "name='" + name + '\'' +
                '}';
    }
}

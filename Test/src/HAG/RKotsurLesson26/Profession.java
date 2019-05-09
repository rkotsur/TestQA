package HAG.RKotsurLesson26;

/**
 * Created by 1 on 13.02.2019.
 */
abstract public class Profession {
    String name;
    String industry;
    Profession(String x,String y){
        name=x;
        industry=y;
    }
    abstract void doWork();


}

class Developer extends Profession{


    public Developer(String x, String y, String specialty) {
        super(x, y);
        this.specialty = specialty;
    }

    private String specialty;

    @Override
    void doWork() {
        System.out.println("Реализация метода doWork в классе Developer");
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}

class Pilot extends Profession{
    public  Pilot (String x,String y, String typeFlyght){
        super(x,y);
        this.typeFlyght=typeFlyght;
    }
    private String typeFlyght;

    @Override
    void doWork() {
        System.out.println("Реализация метода doWork в классе Pilot");
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                ", typeFlyght='" + typeFlyght + '\'' +
                '}';
    }
}
class Runner{

    public static void main(String[] args) {
        Pilot pilot = new Pilot("Вова" , "Легкая промишленность","AН-26");
        Developer developer= new Developer("Петя", "Програмирование","JavaDev");
        Profession profession = new Developer("Олег","Механик","Flyght");
        pilot.doWork();
        developer.doWork();
        System.out.println(pilot);
        System.out.println(developer);
        System.out.println("\n Запуск экземпляр типа Profession который создает еще одного разработчика");
        profession.doWork();
        System.out.println(profession);
    }
}

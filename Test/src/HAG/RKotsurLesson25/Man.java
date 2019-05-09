package HAG.RKotsurLesson25;

/**
 * 1) Создать класс Man (человек), с полями: имя, возраст, пол и вес. Определить методы задания имени, возраста и веса. Создать производный класс Student, имеющий поле года обучения. Определить методы задания и увеличения(изменения) года обучения. У обоих классов должны быть конструкторы по умолчанию и с параметрами. В классе Man создайте метод show, который будет выводить на консоль информацию о человеке. В классе Student метод show нужно переопределить таким образом, чтоб выводилась информация про год обучения.
 */
public class Man {

    public Man() {

    }
    public Man(String name, int yearMan,int weightMan) {
        this.name = name;
        this.yearMan = yearMan;
        this.weightMan = weightMan;
    }
    String name;
    int yearMan;
    float weightMan;
    void show(){
        System.out.println("Имя "+name+"\n "+yearMan+"\n "+weightMan);
    }
}
class Student extends Man{
    Student(String studenName, int studentYearMan, int studentYearStudies){
        name=studenName;
        yearMan=studentYearMan;
        yearStudies=studentYearStudies;

    }
    Student(int x){
        yearStudies=x;
    }

    int yearStudies;
     void plusYearStudies(int i){
         yearStudies=yearStudies+i;
     }
     void setYearStudies(int x){
         yearStudies=x;
     }
    void show(){
        System.out.println("Имя "+name+"\n Количество лет "+yearMan+"\n Вес человека "+weightMan);
    }
}
class Run{
    public static void main(String[] args) {
        Man man= new Man("Тим",20,78);
        man.show();
        Student student = new Student(10);
        student.show();
        Student student1 = new Student("Маша",10,5);
        student1.show();
    }
}

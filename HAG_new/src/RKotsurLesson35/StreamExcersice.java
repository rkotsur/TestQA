package RKotsurLesson35;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExcersice {

    private enum Sex {
        MAN,
        WOMEN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Sex sex;

        public Student(String name, Integer age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student people = (Student) o;
            return Objects.equals(name, people.name) &&
                    Objects.equals(age, people.age) &&
                    Objects.equals(sex, people.sex);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, sex);
        }
    }

    static Collection<Student> students = Arrays.asList(
            new Student("Вася", 16, Sex.MAN),
            new Student("Петя", 23, Sex.MAN),
            new Student("Соня", 18, Sex.WOMEN),
            new Student("Виктор Петрович", 65, Sex.MAN),
            new Student("Дима", 25, Sex.MAN),
            new Student("Катя", 21, Sex.WOMEN),
            new Student("Семен", 33, Sex.MAN),
            new Student("Елена", 42, Sex.WOMEN),
            new Student("Иван Иванович", 69, Sex.MAN)
    );

static Collection<Student> getStudents;
    static List<Student> ex01() {
        // TODO: Задание 1
        // Выбрать всех мужчин-военнообязанных (возраст от 18 до 27 лет)
        Stream <Student> streamFromCollection = students.stream();
        getStudents=streamFromCollection.
                filter((student)-> student.getAge() >= 18 && student.getAge() < 27&& student.getSex() == Sex.MAN)
                .collect(Collectors.toList());
        System.out.println("Выбрать всех мужчин-военнообязанных (возраст от 18 до 27 лет)");
       getStudents.forEach(getStudents -> System.out.println(getStudents));



        return null;
    }

    static Double ex02() {
        // TODO: Задание 2
        System.out.println("\nНайти средний возраст среди мужчин");
        Stream <Student> streamFromColection = students.stream();
        double avgAgeMan= streamFromColection.
                filter((student)->student.getSex()==Sex.MAN)
                .mapToInt(Student::getAge).average().getAsDouble();
        System.out.println("avgAgeMan "+avgAgeMan);

        return null;
    }

    static Long ex03() {
        // TODO: Задание 3
        System.out.println("\nНайти кол-во потенциально работоспособных");
                // студентов в выборке (т.е. от 18 лет и учитывая
        // что женщины выходят в 55 лет, а мужчина в 60)
        Stream <Student> streamFromColection = students.stream();
        long whoWork= streamFromColection.
                filter((student)->student.getAge()>=18).
                filter((student)->student.getSex()==Sex.WOMEN&&student.getAge()<55||(student.getSex()==Sex.MAN&&student.getAge()<60)).
        count();
        System.out.println("whoWork " +whoWork);

        return null;

    }

    static List<Student> ex04() {
        // TODO: Задание 4
        System.out.println("\nОтсортировать студентов по имени в обратном алфавитном порядке");
        Stream <Student> streamFromColection = students.stream();
        getStudents=streamFromColection.
                sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
        getStudents.forEach(getStudents -> System.out.println(getStudents));
        return null;
    }

    static Student ex05() {
        //  TODO: Задание 5
        System.out.println("\nНайти студента с максимальным возрастом");
        Stream <Student> streamFromColection = students.stream();
        Student maxAge =streamFromColection
//                .mapToInt(Student::getAge).average().getAsDouble();
                .max((s1, s2)-> s1.getAge()-s2.getAge())
                .get();
        System.out.println("Max age student "+ maxAge.getAge());
        return null;
    }

    static Student ex06() {
        // TODO: Задание 6
        System.out.println("\nНайти студента с минимальным возрастом");
        Stream <Student> streamFromColection = students.stream();
         Student maxAge =streamFromColection
//                .mapToInt(Student::getAge).average().getAsDouble();
                .min((s1, s2)-> s1.getAge()-s2.getAge())
                .get();
        System.out.println("Min age student "+ maxAge.getAge());
        return null;

    }

    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        // TODO: тестировать здесь
    }
}

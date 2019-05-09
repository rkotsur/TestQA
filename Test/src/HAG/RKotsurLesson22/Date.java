package HAG.RKotsurLesson22;

import java.util.Scanner;

/**
 * 1.Создайте класс Date, у которого будут приватные поля - месяц, день и год.
 *
 В вашем классе должен быть конструктор, который инициализирует три переменные
 экземпляра и предполагает, что предоставленные значения верны.
 Создайте геттеры и сеттеры для каждой переменной класса.
 Создайте метод displayDate, который отображает месяц, день и год,
 разделенные косой чертой (/).
 Напишите тестовое приложение с именем DateTest, которое
 демонстрирует возможности ClassDate.
 (Пользователь вводит день месяц и год)

 */
public class Date {
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int date;
    private int month;
    private int year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }
    void displayDate(){
        System.out.println(getDate()+"/"+ getMonth() +"/"+getYear());

    }
}

class DateTest{
    public static void main(String[] args) {
        Date date= new Date(1,12,1992);
        date.displayDate();
        System.out.println("\n");
        fillForm();
    }
    static public void fillForm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату от 1 до 31");
        int fiilDay=scanner.nextInt();
        System.out.println("Введите месяц от 1 до 12");
        int fillMonth=scanner.nextInt();
        System.out.println("Введите год 4-х значное число");
        int fillYear=scanner.nextInt();
        Date date= new Date(fiilDay,fillMonth,fillYear);
        date.displayDate();

    }
        }
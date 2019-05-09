package HAG.RKotsurLesson24;

/**
 * 1. Создать сущности Кот, Собака, Щука, Золотая Рыбка, Рыба, Животное, Летающий, Плавающий, Бегающий, Прыгающий, Кушающий, Домашнее животное.
 Подумать, что от чего наследовать.

 */
public class ClassExtends {
}
class Eating{
    public Eating(){
        System.out.println("Конструктор класса Кушающий");
    }
}
class Animal extends Eating{
    public Animal() {
        System.out.println("Конструктор класса Животное");
    }
}
class Flying extends Animal{
    public Flying() {
        System.out.println("Конструктор класса Летающее");
    }
}

class Swimming extends Animal{
    public Swimming() {
        System.out.println("Конструктор класса Плавающее");
    }
}

class Running extends Animal{
    public Running() {
        System.out.println("Конструктор класса Бегающее");
    }
}

class Jumping extends Animal{
    public Jumping() {
        System.out.println("Конструктор класса Прыгающее");
    }
}
class Fish extends Swimming{
    public Fish() {
        System.out.println("Конструктор класса Рыба");
    }
}
class GoldFish extends Fish{
    public GoldFish() {
        System.out.println("Конструктор класса Золотая рыбка");
    }
}

class Pike  extends Fish{
    public Pike() {
        System.out.println("Конструктор класса щука");
    }
}

class HomeAnimal extends Running{
    public HomeAnimal() {
        System.out.println("Конструктор класса Домашнее животное");
    }
}
class Dog extends HomeAnimal{
    public Dog() {
        System.out.println("Конструктор класса Собака");
    }
}
class Cat extends HomeAnimal{
    public Cat() {
        System.out.println("Конструктор класса Кот");
    }
}
class Run{
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println();
        GoldFish goldFish= new GoldFish();
    }
}


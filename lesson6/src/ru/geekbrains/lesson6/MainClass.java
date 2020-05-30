package ru.geekbrains.lesson6;

public class MainClass {

    static int countCat = 0;
    static int countDog = 0;

    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик");
        barsik.run(150);
        barsik.swim(45);
        countCat++;

        Cat vasya = new Cat("Вася");
        vasya.run(130);
        vasya.swim(15);
        countCat++;
        System.out.println("Общее количество котов " + countCat);

        Dog bobik = new Dog("Бобик");
        bobik.run(135);
        bobik.swim(8);
        countDog++;
        System.out.println("Общее количество собак " + countDog);
        System.out.println("Общее количество животных " + (countDog + countCat));
    }
}

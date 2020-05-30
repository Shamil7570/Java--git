package ru.geekbrains.lesson6;

public class Cat extends Animal {

    public final int MAX_RUN_LENGTH = 200;

    public Cat(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        if (length > 0 && length <= MAX_RUN_LENGTH) System.out.println(name + " пробежал " + length + "м");
        else System.out.println(false);
    }

    @Override
    void swim(int length) {
        System.out.println(name + " не умеет плавать");
    }
}

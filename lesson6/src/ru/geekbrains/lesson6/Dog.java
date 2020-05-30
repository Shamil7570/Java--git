package ru.geekbrains.lesson6;

public class Dog extends Animal {

    public final int MAX_RUN_LENGTH = 500;
    public final int MAX_SWIM_LENGTH = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        if (length > 0 && length <= MAX_RUN_LENGTH) System.out.println(name + " пробежал " + length + "м");
        else System.out.println(false);
    }

    @Override
    void swim(int length) {
        if (length > 0 && length <= MAX_SWIM_LENGTH) System.out.println(name + " проплыл " + length + "м");
        else System.out.println(false);
    }
}

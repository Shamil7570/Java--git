package ru.geekbrains.lesson6;

abstract class Animal {
    public final int MAX_RUN_LENGTH = 0;
    public final int MAX_SWIM_LENGTH = 0;
    String name;

    abstract void run(int length);

    abstract void swim(int length);

    public Animal(String name) {
        this.name = name;
    }

}

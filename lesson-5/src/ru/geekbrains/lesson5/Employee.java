package ru.geekbrains.lesson5;

public class Employee {
    private String FIO;
    private String position;
    private String email;
    private int age;
    private int salary;
    private int phoneNumber;

    public String getFIO() {
        return FIO;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Employee(String FIO, String position, String email, int age, int salary, int phoneNumber) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(FIO + " " + position + " " + email + " " + phoneNumber + " " + age + " " + salary);
    }
}

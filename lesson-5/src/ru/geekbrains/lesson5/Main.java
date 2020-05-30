package ru.geekbrains.lesson5;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivan Ivan Ivanovich", "Doctor", "blablabla@gmail.com", 29, 30000, 894355546);
        employees[1] = new Employee("Petrov Petr Petrovich", "Driver", "blablabla@mail.com", 45, 35000, 894355598);
        employees[2] = new Employee("Oleg Olegov Olegovich ", "Engineer", "blablabla@yandex.com", 21, 33000, 894353746);
        employees[3] = new Employee("Sidorov Sidor Sidorovich", "Bezdar'", "blablabla@gmail.com", 41, 3500, 894356346);
        employees[4] = new Employee("Ivano Ivan Ivanovich", "Bomzh", "blablabla@gmail.com", 49, 1000, 894355555);

        for (int i = 0; i < employees.length; i++){
            if(employees[i].getAge() > 40){
                employees[i].printInfo();
            }
        }
    }
}

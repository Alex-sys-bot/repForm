package ru.sapteh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String name = reader.readLine();
        System.out.println("Введите возраст: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Введите год рождения: ");
        int year = Integer.parseInt(reader.readLine());

        Person person = new Person(name, age, year);

        System.out.println(personIsEmpty(person));
    }

    public static String personIsEmpty(Person a) {
        String error = "";
        if (a.getName().isEmpty()) error += "имя не задано\n";
        if (a.getAge() == 0) error += "возраст не задан \n";
        if (a.getYear() == 0) error += "год не задан";
        if (!error.isEmpty()) return error;

     return "Объект инициализирован: \n" + a.toString();
    }
}
package ru.sapteh;

import java.io.*;

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

        File dir = new File("C:/java_42/1/Reg");
        File spisok = new File("C:/java_42/1/Reg/spisok.txt");
        System.out.println(dir.mkdir() ? "success" : "error");
        System.out.println(dir.createNewFile() ? "success" : "error");

        FileWriter fw = new FileWriter(spisok);

        System.out.println(personIsEmpty(person));
        fw.write(personIsEmpty(person));

        fw.close();
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
package ru.sapteh;

public class Person {
    private String name;
    private int age;
    private int year;


    public Person(String name, int age, int year){
        this.name = name;
        this.age = age;
        this.year = year;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\n" +
                "Age : " + getAge() + "\n" +
                "Year : " + getYear() + "\n";
    }
}

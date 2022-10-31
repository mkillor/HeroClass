package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person1 = new Person(36,"Mr. Killoran");
        System.out.println(person1.toString());
    }
}

class Person{
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

class Hero extends Person{
    private int newAge;
    private String addedPower;


    public Hero(int age, String name, int newAge, String addedPower) {
        super(age, name);
        this.newAge = newAge;
        this.addedPower = addedPower;
    }

    public int getNewAge() {
        return newAge;
    }

    public void setNewAge(int newAge) {
        this.newAge = newAge;
    }

    public String getAddedPower() {
        return addedPower;
    }

    public void setAddedPower(String addedPower) {
        this.addedPower = addedPower;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "newAge=" + newAge +
                ", addedPower='" + addedPower + '\'' +
                '}';
    }
}

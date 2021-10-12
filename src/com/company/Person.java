package com.company;

public class Person {
    private int age;
    private double height;
    private String name;

    public static final int MAX_AGE = 200;
    public static final double MAX_HEIGHT = 3.2F;

    /*public Person(int age, double height, String name, boolean valid) {
        this.age = age;
        this.height = height;           <- Классический конструктор
        this.name = name;
    }*/

    public void printInfo() {
        System.out.println(this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException{
        if (age > MAX_AGE) throw new IllegalArgumentException("Person is too old!!!");
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws IllegalArgumentException {
        if (height > MAX_HEIGHT) throw new IllegalArgumentException("Person is too tall!!!");
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException{
        if (name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty!!!");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", height=" + height + ", name='" + name + '\'' + '}';
    }

    public static class Builder {
        private Person newPerson;
        public Builder(){
            newPerson = new Person();
        }
        public Builder withAge(int age) throws IllegalArgumentException{
            if (age > MAX_AGE) throw new IllegalArgumentException("Person is too old!!!");
            newPerson.age = age;
            return this;
        }
        public Builder withHeight(double height) throws IllegalArgumentException {
            if (height > MAX_HEIGHT) throw new IllegalArgumentException("Person is too tall!!!");
            newPerson.height = height;
            return this;
        }
        public Builder withName(String name)throws IllegalArgumentException{
            if (name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty!!!");
            newPerson.name = name;
            return this;
        }
        public Person build(){
            return newPerson;
        }
    }
}


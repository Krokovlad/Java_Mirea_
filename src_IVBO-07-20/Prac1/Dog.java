package Prac1;
import com.company.Person;

import java.lang.*;

public class Dog {
    private String name;
    private int age;

    /*public Dog(String n, int a) {
        name = n;
        age = a;
    }*/

    public void setAge(int age) {

        this.age = age;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getName(String name){

        return name;
    }
    public int getAge() {

        return age;
    }
    @Override
    public String toString(){
        return this.name+", возраст "+this.age;
    }
    public void intoHumanAge(){
        System.out.println("Возраст собаки по имени "+name+" - "+age*7+" лет");
    }
    public static class Builder {
        private Dog newDog;
        public Builder(){
            newDog = new Dog();
        }
        public Dog.Builder withAge(int age){
            newDog.age = age;
            return this;
        }

        public Dog.Builder withName(String name){
            newDog.name = name;
            return this;
        }
        public Dog build(){
            return newDog;
        }
    }
}


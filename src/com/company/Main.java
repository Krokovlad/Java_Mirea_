package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person myPerson = new Person.Builder()
                .withName(in.next())
                .withHeight(in.nextDouble())
                .withAge(in.nextInt())
                .build();
        myPerson.printInfo();
        new ClientTest().runTest();
        new EmployeeTest().runTest();
        new PersonTest().runTest();

    }

    private static class ClientTest {
        public void runTest() {
            Client client = new Client("name 1", "service 1", 400.3);
            System.out.println(client.think());
        }
    }

    private static class EmployeeTest {
        public void runTest() {
            Employee employee= new Employee("", "", AbstractPerson.PositionEnum.SELLER);
            System.out.println(employee.think());
        }
    }

    private static class PersonTest {
        public void runTest() {
            Person myPerson = new Person.Builder()
                    .withName("Лёха")
                    .withHeight(Person.MAX_HEIGHT+1)
                    .withAge(Person.MAX_AGE+1)
                    .build();
        }
    }
}

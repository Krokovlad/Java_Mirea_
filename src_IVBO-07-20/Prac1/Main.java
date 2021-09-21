package Prac1;

import com.company.Person;

public class Main {
    public static void main(String[] args){
        new DogTest().runTest();
    }

    private static class DogTest {
        public void runTest() {
            Dog myDog = new Dog.Builder()
                    .withName("Шарик")
                    .withAge(3)
                    .build();
            Dog myDog2 = new Dog.Builder()
                    .withName("Бобик")
                    .withAge(6)
                    .build();
            Dog myDog3 = new Dog.Builder()
                    .withName("Полкан")
                    .build();
            myDog3.setAge(8);
            System.out.println(myDog);
            myDog.intoHumanAge();
            myDog2.intoHumanAge();
            myDog3.intoHumanAge();
        }
    }

    private static class BallTest {
        public void runTest() {
            Ball myBall = new Ball.Builder()
                    .withColour("Cиний")
                    .withSize(3)
                    .build();
            Ball myBall2 = new Ball.Builder()
                    .withColour("Красный")
                    .withSize(6)
                    .build();
            Ball myBall3 = new Ball.Builder()
                    .withColour("Жёлтый")
                    .build();
            myBall3.setSize(8);
            System.out.println(myBall);
            myBall.volumePrint();
            myBall2.volumePrint();
            myBall3.volumePrint();
        }
    }

    private static class BookTest {
        public void runTest() {
            Book myBook = new Book.Builder()
                    .withTitle("Преступление и Наказание")
                    .withAuthor("Ф.М.Достоевский")
                    .build();
            Book myBook2 = new Book.Builder()
                    .withTitle("Медный Всадник")
                    .withAuthor("А.С.Пушкин")
                    .build();
            Book myBook3 = new Book.Builder()
                    .withAuthor("Э.М.Ремарк")
                    .build();
            myBook3.setTitle("Три Товарища");
            System.out.println(myBook);
            myBook.authorPrint();
            myBook2.authorPrint();
            myBook3.authorPrint();
        }
    }

}

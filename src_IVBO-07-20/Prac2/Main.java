package Prac2;

public class Main {
    public static void main(String[] args){
        new AuthorTest().runTest();
        new BallTest().runTest();
    }

    private static class AuthorTest{
        public void runTest(){
            Author author1 = new Author("Михаил", "Mihail.A.@gmail.com", 'М');
            System.out.println(author1);
            Author author2 = new Author("Елена", "Elena.O.@gmail.com", 'Ж');
            System.out.println(author2);
        }
    }

    private static class BallTest{
        public void runTest(){
            Ball b1 = new Ball(100, 100);
            System.out.println(b1);
            b1.move(30, 15);
            System.out.println(b1);
        }
    }
}

package Prac3;

public class Main {
    public static void main (String[] args){
        testShape();
    }

    public static void testShape(){
        Circle circle1 = new Circle("BLUE", false, 5.1);
        System.out.println(circle1.toString());
        Rectangle rec1 = new Rectangle("RED", true, 20.0, 15.0);
        System.out.println(rec1.toString());
        Square sq1 = new Square("YELLOW", true, 50.0);
        System.out.println(sq1.toString());
    }

    public static void testMovableRectangle(){
        int Speedx1 = 1;
        int Speedx2 = 1;
        int Speedy1 = 1;
        int Speedy2 = 2;
        MovableRectangle rectangle = new MovableRectangle(0, 5, 5, 0, Speedx1, Speedx2, Speedy1, Speedy2);
        rectangle.Speedx(Speedx1,Speedx2,Speedy1,Speedy2);
        MovablePoint point1 = new MovablePoint(0, 5, 1, 1);
        MovablePoint point2 = new MovablePoint(5, 0, 1, 1);
        System.out.println(point1);
        point1.MoveLeft();
        point1.MoveDown();
        System.out.println(point1);
        System.out.println(point2);
        point1.MoveLeft();
        point1.MoveDown();
        System.out.println(point2);
        System.out.println(point1);
        System.out.println(rectangle);
        rectangle.MoveDown();
        rectangle.MoveRight();
        System.out.println(rectangle);
    }
}

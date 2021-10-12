package Lab4;

public class Main {
    public static void main (String[] args ){
        testCar();
        testBall();
    }

    public static void testCar(){
        Car car1 = new Car();
        Car car2 = new Car();
        car1.setName("BMW 320i");
        car1.setPrice(500000);
        car2.setName("LADA 2107");
        car2.setPrice(5000);
        System.out.println(car1.getName()+" price is: "+car1.getPrice());
        System.out.println(car2.getName()+" price is: "+car2.getPrice());
    }
    public static void testBall(){
        Ball ball1 = new Ball();
        Ball ball2 = new Ball();
        ball1.setName("Adidas");
        ball1.setPrice(1000);
        ball2.setName("Nike");
        ball2.setPrice(1500);
        System.out.println(ball1.getName()+" price is: "+ball1.getPrice());
        System.out.println(ball2.getName()+" price is: "+ball2.getPrice());
    }
}


package Prac3;

public class Circle extends Shape{
    protected double radius;

    public Circle(String colour, boolean isFilled, double radius) {
        super(colour, isFilled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() throws IllegalArgumentException{
        if(isFilled()) {
            return 3.14 * Math.pow(radius, 2);
        }
        else throw new IllegalArgumentException("нет");
    }

    @Override
    public double getPerimeter() {
        return 3.14*radius*2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", colour='" + getColour() + '\'' +
                ", isFilled=" + isFilled() +
                ", Perimeter=" + getPerimeter() + '\''+
                ", Area=" + getArea() + '\''+
                '}';
    }
}

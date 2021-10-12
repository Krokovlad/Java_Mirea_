package Prac3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(String colour, boolean isFilled, double width, double length) {
        super(colour, isFilled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() throws IllegalArgumentException{
        if(isFilled()) {
            return length*width;
        }
        else throw new IllegalArgumentException("нет");
    }

    @Override
    public double getPerimeter() {
        return width*2+length*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                ", colour='" + getColour() + '\'' +
                ", isFilled=" + isFilled() +
                ", Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                '}';
    }
}

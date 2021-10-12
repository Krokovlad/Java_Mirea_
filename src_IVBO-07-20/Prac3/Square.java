package Prac3;

public class Square extends Rectangle{
    protected double side;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String colour, boolean isFilled, double side) {
        super(colour, isFilled, side, side);
    }

    @Override
    public void setWidth(double side){
        this.width = side;
    }
    @Override
    public void setLength(double side){
        this.length = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

}

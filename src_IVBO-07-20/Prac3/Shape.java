package Prac3;

public abstract class Shape {
    protected String colour;
    protected boolean Filled;

    public Shape() {
    }

    public Shape(String colour, boolean Filled) {
        this.colour = colour;
        this.Filled = Filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean filled) {
        Filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + getColour() + '\'' +
                ", isFilled=" + isFilled() +
                '}';
    }

}

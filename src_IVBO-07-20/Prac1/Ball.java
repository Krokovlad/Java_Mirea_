package Prac1;

public class Ball {
    private String colour;
    private int size;

    public void setSize(int size) {
        this.size = size;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour(String colour){
        return colour;
    }
    public int getSize() {
        return size;
    }
    public String toString(){
        return this.colour+", size "+this.size;
    }
    public void volumePrint(){
        System.out.println("Объем шара цвета "+this.colour+" - "+(3/4*3.14*(size^3)));
    }
    public static class Builder {
        private Ball newBall;
        public Builder(){
            newBall = new Ball();
        }
        public Ball.Builder withSize(int size){
            newBall.size = size;
            return this;
        }
        public Ball.Builder withColour(String colour){
            newBall.colour = colour;
            return this;
        }
        public Ball build(){
            return newBall;
        }
    }
}

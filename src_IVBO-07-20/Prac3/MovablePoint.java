package Prac3;

public class MovablePoint implements Movable{
    public int x;
    public int y;
    public int Speedx;
    public int Speedy;
    MovablePoint(int x,int y, int Speedx, int Speedy){
        this.x = x;
        this.y = y;
        this.Speedx = Speedx;
        this.Speedy = Speedy;
    }

    @Override
    public void MoveDown() {
        y--;
    }

    @Override
    public void MoveUp() {
        y++;
    }

    @Override
    public void MoveLeft() {
        x--;
    }

    @Override
    public void MoveRight() {
        x++;
    }
    public String toString(){
        return "Point (" + x + ", " + y + ") ";
    }
}

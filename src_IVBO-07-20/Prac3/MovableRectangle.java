package Prac3;

public class MovableRectangle implements Movable{
    public MovablePoint topLeft;
    public MovablePoint bottomRight;
    MovableRectangle(int x1, int x2, int y1, int y2, int Speedx1, int Speedx2, int Speedy1,int Speedy2){
        this.topLeft = new MovablePoint(x1, y1, Speedx1, Speedy2);
        this.bottomRight = new MovablePoint(x2, y2, Speedx2, Speedy2);
    }
    public void Speedx(int Speedx1, int Speedx2, int Speedy1, int Speedy2){
        if((Speedx1 != Speedx2) || (Speedy1 != Speedy2)) {
            System.out.println("Проверьте скорость точек. Она должна быть одинаковой.");
            System.exit(0);
        }
    }
    public String toString(){
        return "Левая верхняя вершина (" + topLeft.x + ", " + bottomRight.y + ") " + "Правая нижняя вершина (" + bottomRight.x + ", " + bottomRight.y + ") ";
    }

    @Override
    public void MoveUp() {
        topLeft.MoveUp();
        bottomRight.MoveUp();
    }

    @Override
    public void MoveDown() {
        topLeft.MoveDown();
        bottomRight.MoveDown();
    }

    @Override
    public void MoveRight() {
        topLeft.MoveRight();
        bottomRight.MoveRight();
    }

    @Override
    public void MoveLeft() {
        topLeft.MoveLeft();
        bottomRight.MoveLeft();
    }
}

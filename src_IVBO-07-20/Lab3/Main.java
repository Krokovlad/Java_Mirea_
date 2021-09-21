package Lab3;
import java.lang.*;
public class Main {
    public static void main(String[] args){
        new TestFork().runTest();
        new TestBowl().runTest();
        new TestSpoon().runTest();
        Fork fork = new Fork(Dish.Material.Aluminium, 10, false, false, "White", 4);
        //fork.setDisposable(true);
        Bowl emptyBowl = new Bowl(Dish.Material.Porcelain, 100, true, false, "Blue");
        emptyBowl.eatSoup();
    }
    public static class TestFork{
        public void runTest(){
            Fork fork = new Fork(Dish.Material.Cardboard, 10, false, true, "White", 4);
            System.out.println("Can eat soup? - " + fork.canEatSoup());
            System.out.println("Can stab some1? - " + fork.canStabSome1());
            System.out.println("Teeth - " + fork.getTeethCount());
        }
    }
    public static class TestBowl{
        public void runTest() {
            Bowl bowl = new Bowl(Dish.Material.Porcelain, 100, true, false, "Blue");
            bowl.setAmountOfSoup(10);
            System.out.println(bowl.eatSoup());
        }
    }
    public static class TestSpoon{
        public void runTest(){
            Spoon spoon = new Spoon(Dish.Material.Inox, 15, true, false, "Grey");
            Bowl bowl = new Bowl(Dish.Material.Porcelain, 100, true, false, "Blue");
            bowl.setAmountOfSoup(15);
            spoon.eatSoup(bowl);
        }
    }
}

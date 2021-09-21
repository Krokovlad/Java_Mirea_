package Lab3;

public class Spoon extends Dish{


    public Spoon(Material material, int cost, boolean heatResist, boolean disposable, String color) {
        super(material, cost, heatResist, disposable, color);
    }

    public boolean canEatSoup(){
        return true;
    }
    public boolean canStabSome1(){
        return false;
    }

    public void eatSoup(Bowl bowl){
        bowl.eatSoup();
    }

}

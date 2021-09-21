package Lab3;

public class Fork extends Dish{

    int teethCount;

    public Fork(Material material, int cost, boolean heatResist, boolean disposable, String color, int teethCount) {
        super(material, cost, heatResist, disposable, color);
    }

    public boolean canEatSoup(){
        return false;
    }
    public boolean canStabSome1(){
        return !isDisposable();
    }

    public int getTeethCount() {
        return teethCount;
    }

    public void setTeethCount(int teethCount) {
        this.teethCount = teethCount;
    }
}

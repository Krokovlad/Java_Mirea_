package Lab3;

public class Bowl extends Dish{

    int amountOfSoup;
    public Bowl(Material material, int cost, boolean heatResist, boolean disposable, String color) {
        super(material, cost, heatResist, disposable, color);
    }

    public boolean canStoreSoup(){
        return true;
    }

    public int getAmountOfSoup() {
        return amountOfSoup;
    }

    public void setAmountOfSoup(int amountOfSoup) {
        this.amountOfSoup = amountOfSoup;
    }

    public int eatSoup(){
        System.out.println("Eating Soup");
        for(int i = this.amountOfSoup; i>=0; i--){
            setAmountOfSoup(i);
            System.out.println("Soup left: "+amountOfSoup);
        }
        System.out.println("Good Soup!");
        return 0;
    }
}

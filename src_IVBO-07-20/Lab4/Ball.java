package Lab4;

public class Ball implements Priceable{
    int price;
    String name;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice(){
        return this.price;
    }

    public String getName() {
        return name;
    }
}

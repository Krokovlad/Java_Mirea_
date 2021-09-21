package Lab3;

public abstract class Dish {
    private Material material;
    private int cost;
    private boolean heatResist;
    private boolean disposable;
    private String color;

    public Dish(Material material, int cost, boolean heatResist, boolean disposable, String color) {
        this.material = material;
        this.cost = cost;
        this.heatResist = heatResist;
        this.disposable = disposable;
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material){
        this.material = material;
    }

    public boolean isHeatResist() {
        return heatResist;
    }

    public void setHeatResist(boolean heatResist) {
        this.heatResist = heatResist;
    }

    public boolean isDisposable() {
            return disposable;
    }

    public void setDisposable(boolean disposable) throws IllegalArgumentException{
        if (this.material.equals(Material.Aluminium) || this.material.equals(Material.Inox)) {
            throw new IllegalArgumentException("Данный материал не является перерабатываемым");
        }
        this.disposable = disposable;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public enum Material {
        Cardboard,
        Aluminium,
        Inox,
        Plastic,
        Porcelain
    }

}

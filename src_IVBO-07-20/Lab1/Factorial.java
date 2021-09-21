package Lab1;

public class Factorial {
    private int base;

    public Factorial(int base) {
        this.base = base;
    }

    public long factorialCount(){
        long f = 1;
        for(int i = 1; i <= this.base; i++){
            f = f*i;
        }
        return f;
    }
}

package Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Factorial factorial = new Factorial(in.nextInt());
        System.out.println(factorial.factorialCount());
    }
}

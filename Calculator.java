package calc;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        return b / a;
    }
    public int exponent(int a, int b){
        return (int) Math.pow(a,b);
    }
    public int square(int a){
        return (int) Math.pow(a,a);
    }
    public int squareRoot(int a){
        return (int) Math.sqrt(a);
    }
    public double sine(double a){
        return Math.sin(a);
    }

}

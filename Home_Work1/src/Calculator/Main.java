package Calculator;

public class Main {
    public static void main(String[] args){
        CalculatorPrototype maths = new CalculatorPrototype();
        System.out.println(maths.sum(15,3));
        System.out.println(maths.subtract(15,3));
        System.out.println(maths.divide(15,3));
        System.out.println(maths.multiply(15,3));
    }
}

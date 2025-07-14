package classes.calculator;

public class Multiply /*extends Operation*/ implements IOperation {

    @Override
    public double execute(double a, double b){
        return a * b;
    }
}

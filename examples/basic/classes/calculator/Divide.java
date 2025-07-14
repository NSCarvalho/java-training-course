package classes.calculator;

public class Divide /*extends Operation*/ implements IOperation {

    @Override
    public double execute(double a, double b){
        return a / b;
    }
}

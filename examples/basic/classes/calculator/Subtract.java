package classes.calculator;

public class Subtract /*extends Operation*/ implements IOperation {

    @Override
    public double execute(double a, double b){
        return a - b;
    }
}

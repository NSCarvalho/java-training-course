package classes.calculator;

public class Add /*extends Operation*/ implements IOperation {

    @Override
    public double execute(double a, double b){
        return a + b;
    }
}

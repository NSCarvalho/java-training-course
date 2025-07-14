package classes.payments;

public class PaymentNote {
    private final double fee;
    private final double paymentValue;

    public PaymentNote(double fee, double paymentValue) {
        this.fee = fee;
        this.paymentValue = paymentValue;
    }

    public void print() {
        System.out.println("You have successfully paid €" + paymentValue + " with a €" + fee + " fee!");
    }
}

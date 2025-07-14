package classes.payments;

public class MBWay implements Payment {

    private final double fee = 0.0;
    private final double paymentValue;

    private MBWay(double paymentValue) {
        this.paymentValue = paymentValue;
    }

    public static PaymentNote pay(double paymentValue) {
        return getInstance(paymentValue)
                .execute();
    }

    public static MBWay getInstance(double paymentValue) {
        return new MBWay(paymentValue);
    }

    @Override
    public PaymentNote execute() {
        return new PaymentNote(fee, paymentValue);
    }
}

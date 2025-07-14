package classes.payments;

public class PaymentMain {

    public static void main(String[] args) {
        PaymentNote paymentNote = MBWay.pay(100);
        paymentNote.print();
    }
}
